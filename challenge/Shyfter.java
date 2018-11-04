package challenge;
import java.util.Arrays; 
import java.util.Collections;
class Shyfter {

    public static final void main(String[] args) {
	int num = 21;
	System.out.println(solution(num));	
    }
    public static String solution(int N) {
	
	int L = 0;
        int R = 1;
        
        String result = "";
        int resultval = 0;
        boolean dir;
        if (N < 0) {
            dir = true;    
        } else {
            dir = false;
        }
        
        int oldleftspread = 0;
        int oldrightspread = 0;
        int leftspread = 0;
        int rightspread = 0;
        while ( (L != N) && (R != N) ) {
        
            oldleftspread = N - L;
            oldrightspread = N - R;
                
            L = doMethod(L, R, dir);
            R = doMethod(R, R, dir);
            
            leftspread = N - L;
            rightspread = N - R;
        
                
            if (dir) {
                result = result + "L";
            } else {
                result = result + "R";
            }
            
            if ((leftspread < oldleftspread) || (rightspread < oldrightspread)) {
                dir = true;
            } else {
                dir = false;
            }
            
            
        }
        
        return result;
	
    }
    private static int doMethod(int lval, int rval, boolean direction) {
        if (direction) {
            return 2 * lval -rval;
        } else {
            return 2 * rval - lval;
        }
        
    }
}
