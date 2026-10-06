import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        int x = 0;
        
        int n = 0;
        
        String[] pnArr = polynomial.split(" \\+ ");
        
        for (String s: pnArr) {
            if (s.equals("x")) {
                x += 1;
            } else if(s.contains("x")) {
                s= s.replace("x", "");
                x += Integer.parseInt(s);
            } else {
                n += Integer.parseInt(s);
            }
        }
        
        if (x == 0) {
            answer += String.valueOf(n);
        } else {
            if (n == 0) {
                if (x == 1) {
                    answer += "x";
                } else {
                    answer += String.valueOf(x);
                    answer += "x";
                }
            } else {
                if (x == 1) {
                    answer += "x + ";
                } else {
                    answer += String.valueOf(x);
                    answer += "x + ";
                }
                answer += String.valueOf(n);
            }
        }
        
        return answer;
    }
}