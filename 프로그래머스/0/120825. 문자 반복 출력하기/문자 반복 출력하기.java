import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        StringBuilder answer_builder = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer_builder.append(my_string.charAt(i));
            }
        }
        
        answer = answer_builder.toString();
        
        return answer;
    }
}