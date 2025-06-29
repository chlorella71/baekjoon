import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        
        List<String> strList = new ArrayList<>();
        String str ="";
        for (int i = 0; i< myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                if (!str.equals("")) {
                    strList.add(str);
                    str="";
                }
            } else if (i == myString.length() -1) {
                    str+=myString.charAt(i);
                    strList.add(str);
            } else {
                str+=myString.charAt(i);
            }
        }
        
        
        
        String[] strArr = strList.toArray(new String[strList.size()]);
        Arrays.sort(strArr);
        return strArr;
    }
}