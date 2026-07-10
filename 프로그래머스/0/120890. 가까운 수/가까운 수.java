class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        int temp = 100;
        for (int i = 0; i< array.length; i++) {
            if (array[i] <= n) {
                if ((n -array[i]) <= temp) {
                    temp = ( n - array[i]);
                    answer = array[i];
                }
            } else if (array[i] > n) {
                if (array[i] - n < temp) {
                    temp = (array[i] - n);
                    answer = array[i];
                }
            }
        }
        
        return answer;
    }
}