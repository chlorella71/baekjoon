import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        List<Character> answer_list = new ArrayList<>();
        
        for (int i = 0; i < index_list.length; i++) {
            answer_list.add(chars[index_list[i]]);
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : answer_list) {
            sb.append(c);
        }
        
        answer = sb.toString();
        
        
        return answer;
    }
}