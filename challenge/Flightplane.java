package challenge;
import java.util.Arrays; 
import java.util.Collections;
class Flightplane {

    public static final void main(String[] args) {
	int[] num = new int[4];
	num[0] = 50;
	num[1] = 100;
	num[2] = 50;

	System.out.println(solution(num));	
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	        
        int result = 0;
	System.out.println(result);	
	int i = 0;
        while (i < A.length) {
            if (i+2 <= A.length) {
            	if ((A[i] < A[i+i] ) && ( A[i+1] > A[i+2] ) )  {
                	result++;
            	} 

	    }
	    
            i++;
        }
      	return result;
    }
}
