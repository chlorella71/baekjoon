import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder answerBuilder = new StringBuilder();
        
        for (int i = 0; i< my_string.length(); i++) {
            if (my_string.charAt(i) < 97) {
                answerBuilder.append((char)(my_string.charAt(i) + 32));
            } else {
                answerBuilder.append(my_string.charAt(i));
            }
        }
        
        System.out.println(answerBuilder);
        
        char temp;
        for (int i = 0; i< answerBuilder.length() - 1; i++) {
            for (int j = i+1; j<answerBuilder.length(); j++) {
                if (answerBuilder.charAt(i) > answerBuilder.charAt(j)) {
                    temp = answerBuilder.charAt(i);
                    answerBuilder.setCharAt(i, answerBuilder.charAt(j));
                    answerBuilder.setCharAt(j, temp);
                }
            }
        }
        
        System.out.println(answerBuilder);
         
        answer = answerBuilder.toString();
        return answer;
    }
}