import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        for (int i = 0; i<b.length; i++) {
            if (b[i] != a[i]) {
                answer = 0;
            }
        }
        
        return answer;
    }
}