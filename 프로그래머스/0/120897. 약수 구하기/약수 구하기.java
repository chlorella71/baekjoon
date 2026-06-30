import java.util.*;

class Solution {
    public int[] solution(int n) {
        // int[] answer = {};
        
        List<Integer> answerList = new ArrayList<Integer>();
        
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                answerList.add(i);
            }
        }
        
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}