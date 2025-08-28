import java.util.List;
import java.util.ArrayList;
import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, List<String>> strList = new HashMap<>();
        
        for (int i = 0; i< strArr.length; i++) {
            if (strList.get(strArr[i].length()) == null) {
                strList.put(strArr[i].length(), new LinkedList<>(Arrays.asList(strArr[i])));
            } else {
                strList.get(strArr[i].length()).add(strArr[i]);
            }
        }
        
        int size = 0;
        
        for (List<String> list : strList.values()) {
            if (list.size() > size ) {
                size = list.size();
            }
        }
        return size;
    }
}