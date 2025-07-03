import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        // int[] answer = {};
        
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else if (!stk.isEmpty() && stk.get(stk.size() -1) == arr[i]) {
                stk.remove(stk.size() - 1);
                i++;
            } else if (!stk.isEmpty() && stk.get(stk.size() -1) != arr[i]) {
                stk.add(arr[i]);
                i++;
            }
        }
        
        if (stk.isEmpty()) {
            return new int[]{-1};
        }
        
        int[] answer = stk.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}