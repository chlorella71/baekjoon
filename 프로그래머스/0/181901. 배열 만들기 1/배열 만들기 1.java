import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        
        List<Integer> ints = new ArrayList<>();
        
        for(int i = 1; i <= n; i++) {
            if (i % k == 0) {
                ints.add(i);
            }
        }
        
        int[] answer = ints.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}