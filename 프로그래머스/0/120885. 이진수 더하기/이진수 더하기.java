import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        Stack<Character> sc = new Stack<>();
        
        String a, b;
        if (bin1.length() <= bin2.length()) {
            a = bin2;
            b = bin1;
        } else {
            a = bin1;
            b = bin2;
        }
        System.out.printf("a == %s, b == %s\n", a, b);
        
        int temp = 0;
        for (int i = a.length() -1; i >= 0; i--) {
            int d = a.length() - b.length();
            char x = a.charAt(i);
            
            char y;
            if ( (i-d)>=0) {
                y = b.charAt(i - d);
            } else {
                y = '0';
            }
        
            int z = (x-'0')+(y-'0')+temp;
            temp = 0;
            if (z == 0) {
                sc.push('0');
            } else if(z == 1) {
                sc.push('1');
            } else if (z==2) {
                sc.push('0');
                temp = 1;
            } else {
                sc.push('1');
                temp = 1;
            }
            if (i == 0 && temp > 0) {
                sc.push('1');
            }
            char p = sc.peek();
            // System.out.print(p);
        }
        
        while(!sc.isEmpty()) {
            answer += sc.pop();
        }
        
        return answer;
    }
}