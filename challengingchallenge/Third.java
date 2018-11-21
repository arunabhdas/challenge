// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] T) {
        // write your code in Java SE 8
        int counter = 1;
        int winterMax = T[0];
        int summerMax = Integer.MIN_VALUE;
        boolean isWinter = true;
        for (int i = 1; i < T.length; i++) {
            int elem = T[i];
            if (isWinter) {
                if (elem > winterMax) {
                    isWinter = false;
                    counter = i;
                }
            }
            else {
                if (elem <= winterMax) {
                    isWinter = true;
                    winterMax = summerMax;
                }
            }
            summerMax = Math.max(summerMax, elem);
        }
        if (isWinter) {
            counter = T.length;
        }
        // System.out.println(counter);
        return counter;
    }
}
