import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer;
        
        StringBuilder answerBuilder = new StringBuilder(String.valueOf(my_string.charAt(0)));
        
        boolean exist = false;
        for (int i = 1; i< my_string.length(); i++) {
            exist = false;
            for (int j = 0; j < answerBuilder.length(); j++) {
                if (answerBuilder.charAt(j) == my_string.charAt(i)) {
                    exist = true;
                }
            }
            if (exist == false) {
                answerBuilder.append(String.valueOf(my_string.charAt(i)));
            }
        }
        answer = answerBuilder.toString();
        
        
        
        return answer;
    }
}