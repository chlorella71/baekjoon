import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        Stack<Integer> intStack = new Stack<>();

        int i = 0;
        while (intStack.size() < k) {
            if (i < arr.length) {
                if (intStack.search(arr[i]) == -1) {
                    intStack.push(arr[i]);
                }
            } else {
                intStack.push(-1);
            }
            i++;
        }
        
        
        
        return intStack.stream().mapToInt(Integer::intValue).toArray();
    }
}