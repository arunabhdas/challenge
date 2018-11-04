package challenge;
import java.util.Arrays; 
import java.util.Collections;
class Minmax {

    public static final void main(String[] args) {
	int[] num = new int[5];
	num[0] = 1;
	num[1] = 3;
	num[2] = 6;

	System.out.println(solution(num));	
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
    	        
        int min = Arrays.stream(A).min().getAsInt();
        int max = Arrays.stream(A).max().getAsInt();
        int result = min;
	System.out.println(max);	
        int count = min;
        while (count < A.length) {
            
            if (!Arrays.asList(A[count]).contains(count) ) {
                
                result = count;
            } else {
		return result;
	    }
            count++;
        }
      	return result;
    }
}
