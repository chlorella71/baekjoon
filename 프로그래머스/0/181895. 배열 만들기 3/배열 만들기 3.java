import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        int[] arr_a = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        
        
        int[] arr_b = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        int[] answer = new int[arr_a.length + arr_b.length];
        
        for (int i = 0; i < arr_a.length; i++) {
            answer[i] = arr_a[i];
        }
        
        int idx = 0;
        for (int i = arr_a.length; i < answer.length; i++) {
            answer[i] = arr_b[idx++];
        }
        
        
        return answer;
    }
}