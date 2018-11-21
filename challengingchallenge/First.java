// you can also use imports, for example:
import java.util.ArrayList;
import java.util.List;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(String S) {
        // write your code in Java SE 8
        String formattedString = "";
        String trimSpaceString = S.replaceAll("\\s","");
        String trimDashString = trimSpaceString.replaceAll("-", "");
        // System.out.println(trimDashString);
        // System.out.println("------" + trimDashString.length());
        
        
        List<String> strings = new ArrayList<String>();
        int index = 0;
        while (index < trimDashString.length()) {
            // strings.add(trimDashString.substring(index, Math.min(index + 3,trimDashString.length())));
            if (index + 3 < trimDashString.length()-1 ) {
                formattedString += trimDashString.substring(index, Math.min(index + 3,trimDashString.length())) + "-";    
                index += 3;
            } else {
                
                if (index + 3 == trimDashString.length() ) {
                    formattedString += trimDashString.substring(index, Math.min(index + 3,trimDashString.length()));
                    index += 3;
                } else {
                    
                    if (index + 2 == trimDashString.length() ) {
                        formattedString += trimDashString.substring(index, Math.min(index + 2,trimDashString.length()));
                        index += 2;
                    } else {
                        formattedString += trimDashString.substring(index, Math.min(index + 2,trimDashString.length())) + "-";
                        index += 2;
                    }
                }
 
            }
            
            
        }
 
        return formattedString;
        
    }
}
