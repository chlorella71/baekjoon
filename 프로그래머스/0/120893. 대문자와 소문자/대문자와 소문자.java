import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder answerBuilder = new StringBuilder();
        
        int temp;
        for (int i = 0; i< my_string.length(); i++) {
            temp = my_string.charAt(i);
            if (temp < 97) {
                answerBuilder.append((char)(temp + 32));
            } else {
                answerBuilder.append((char)(temp - 32));
            }
        }
        answer = answerBuilder.toString();
         
        return answer;
    }
}