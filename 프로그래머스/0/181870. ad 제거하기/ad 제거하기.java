import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        
        List<String> a = new ArrayList<>();
        for (int i = 0; i<strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                a.add(strArr[i]);
            }
            
        }
        return a.toArray(new String[a.size()]);
    }
}