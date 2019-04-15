import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarAccident {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {2,1,1},B= {2,1,1,2,1},C={5,1,2,1,1};
		System.out.println(juge(A,A.length)); //True
		System.out.println(getLiar(B,B.length));	// 3
		System.out.println(getLiars(C,C.length));	// {0,2}
		
	}
	
	public static boolean juge(int[] A,int N){
		int i = 0;
		
		for(i=0; i<N-1; i++)
			if( (A[i]-A[i+1])!=1 && (A[i]-A[i+1])!=0 )
				return false;
		
		return A[i] == 1;
	}
	
	public static int getLiar(int[] A,int N){
		
		if(A[N-1]!=1) return N-1;
		if(N==2) return 0;
		
		for(int i=0; i<N-1; i++) 
			if( (A[i]-A[i+1])!=1 && (A[i]-A[i+1])!=0 )
				if(i>1) return ( (A[i]<A[i+1]) && (A[i]<A[i-1]) ) ?i :i+1;
				 else return ( (A[i+1]<A[i]) && (A[i+1]<A[i+2]) ) ?i+1 :i;
			
		return -1;
	}
	
  
    static List<Integer> getLiars(int A[],int N) 
    { 	
    	int[] length = new int[N];
    	int[] prev = new int[N];
    	
    	for(int i=0; i<N; i++) 
    		length[i] = (A[i]<=(N-1-i)) ?1:0;
    	
    	Arrays.fill(prev, -1);
     
        for (int i=0; i<N; i++)
            for (int j=i+1; j<N; j++)
                if ((A[i]-A[j])>=0 && (A[i]-A[j])<=(j-i))
                    if (length[i] + 1 > length[j])
                    {
                        length[j] = length[i] + 1;
                        prev[j] = i;
                    }
     
        int n = 0, pos = 0;
        for (int i=0; i<N; i++)
            if (length[i] > n)
            {
                n = length[i];
                pos = i;
            }
        
        List<Integer> honest = new ArrayList<Integer>();
        List<Integer> liar = new ArrayList<Integer>();
        while(prev[pos] !=-1 ) {
        	honest.add(pos);
        	pos = prev[pos];
        }
        honest.add(pos);
        
        for(int i=0; i<N; i++)
        	if(!honest.contains(i))
        		liar.add(i);
        
        return liar;  
        
    } 

}
