有n台車相撞成一直線，假設第一台車先煞停且最後一台車沒有煞停，此題目輸入前n-1台車回報之被撞次數<br>
題目1:判斷輸入之回報次數是否合理<br>
題目2:如果當中有1人謊報，請抓出來<br>
題目3:如果當中有超過1人謊報，請抓出來<br>

Example 1:<br>
Input:  A = [1,1], n=3<br>
Output: True<br>
Explanation:第一台煞、第二台煞、第三台沒煞<br>

Example 2:<br>
Input:  A = [2,1,1], n=4<br>
Output: True<br>
Explanation:第一台煞、第二台沒煞、第三台煞、第四台沒煞<br>

Example 2:<br>
Input:  A = [3,2,0], n=4<br>
Output: False<br>
Explanation: 第三台說謊，應該為[3,2,1]<br>

規則分析:<br>
1.合理的撞擊次數為單調遞減數列(間隔最多+1)<br>
2.第i台車的被撞數<(n-i)<br>
3.第n-1台車必定為1(最後一台車沒有煞停)<br>

演算法設計<br>
題目1:從頭開始檢查陣列是否為單調遞減(間隔最多+1)且最後一位必須為1。時間複雜度O(N)<br>
題目2:同上述情況檢查到違反情況時確認違例種類(大小大 or 小大小)。時間複雜度O(N)<br>
題目3:尋找陣列中的最長單調遞減子序列，找到結果即為說真話之車主，去掉說真話之車主即為答案。時間複雜度O(N^2)<br>
