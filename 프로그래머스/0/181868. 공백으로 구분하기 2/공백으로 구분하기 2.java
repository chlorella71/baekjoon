import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        StringBuilder sb= new StringBuilder();
        String str = "";
        List<String> strList = new ArrayList<>();
        
        
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) == ' ') {
                if (str.equals("")) {
                    continue;
                } else {
                    strList.add(str);
                    str = "";
                }
            } else if (i == (my_string.length() - 1)) {
                str += my_string.charAt(i);
                strList.add(str);
                break;
            } else {
                str += my_string.charAt(i);
            }
        }
        
        
        
        return strList.toArray(new String[strList.size()]);
    }
}