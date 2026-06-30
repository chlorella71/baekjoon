class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        
        int temp = 0;
        int index = 0;
        
        for (int i = 0; i< array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
                index = i;
            }
        }
        
        answer[0] = temp;
        answer[1] = index;
        
        return answer;
    }
}