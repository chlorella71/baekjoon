import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int cnt = 0;
        int idx = 0;
        
        StringBuilder sb = new StringBuilder(A);
        
        if (sb.toString().equals(B)) {
            answer = cnt;
            return answer;
        }
        
        do {
            sb.insert(0, sb.charAt(sb.length() - 1));
            sb.deleteCharAt(sb.length() - 1);
            cnt++;
            idx++;
            if (sb.toString().equals(B)) {
                answer = cnt;
                return answer;
            }
        } while (idx < sb.length());
        
        return answer;
    }
}