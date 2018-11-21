// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int X, int Y, int Z) {
        // write your code in Java SE 8
        int maxWaitTime = 0;
        
        for (int i = 0; i < A.length; i++) { 
            if (A[i] > X && A[i] > Y && A[i] > Z) {
                maxWaitTime = -1;
            } else {
                if (A[i] > maxWaitTime)
                {
                    maxWaitTime = A[i];
                }
            }
            
        }
        
        return maxWaitTime;
    }
}
