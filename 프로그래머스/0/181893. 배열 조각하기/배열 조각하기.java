import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        List<Integer> il = Arrays.stream(arr).boxed().collect(Collectors.toList());
        
        for (int i = 0; i < query.length; i++) {
            if (i % 2 ==0) {
                il = il.subList(0, query[i] + 1);
            } else {
                il = il.subList(query[i], il.size());
            }
        }
        
        return il.stream().mapToInt(Integer::intValue).toArray();
    }
}