import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        
        List<Integer> xList = new ArrayList<>();
        
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i]*2; j++) {
                    xList.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    xList.remove(xList.size() -1);
                }
            }
        }
    
        
        return xList.stream().mapToInt(Integer::intValue).toArray();
    }
}