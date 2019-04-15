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
1.合理的撞擊次數為單調遞增數列<br>
2.第n-1台車必定為1(最後一台車沒有煞停)<br>
