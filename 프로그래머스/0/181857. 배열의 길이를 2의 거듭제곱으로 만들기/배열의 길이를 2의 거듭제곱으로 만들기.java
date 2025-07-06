import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        Stack<Integer> arrStack = new Stack<>();
        
        for (int i= 0; i< arr.length; i++) {
            arrStack.push(arr[i]);
        }
        
        while ((arrStack.size() & (arrStack.size() - 1)) != 0) {
            arrStack.push(0);
        }
        
        
        
        return arrStack.stream().mapToInt(Integer::intValue).toArray();
    }
}