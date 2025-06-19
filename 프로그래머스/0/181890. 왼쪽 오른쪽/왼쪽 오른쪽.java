import java.util.List;
import java.util.ArrayList;

class Solution {
    
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        List<String> answer_list = new ArrayList<>();
        
        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j < i; j++) {
                    answer_list.add(str_list[j]);
                }
                return answer_list.toArray(new String[0]);
            } else if (str_list[i].equals("r")) {
                for (int j = i + 1; j < str_list.length; j++) {
                    answer_list.add(str_list[j]);
                }
                return answer_list.toArray(new String[0]);
            }
        }
        
        return answer;
    }
}