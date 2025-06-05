import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        
        for (int i = 0; i < my_string.length(); i+=m) {
            answer.append(my_string.substring(i, i+m).charAt(c - 1));
        }
            
        return answer.toString();
    }
}