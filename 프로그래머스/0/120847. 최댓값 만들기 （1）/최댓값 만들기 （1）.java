class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int second = 0;
        int already = 0;
        
        for (int i = 0; i < numbers.length; i ++) {
            if ( max < numbers[i]) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max && already == 1) {
                second = max;
                break;
            }
            if (numbers[i] == max) {
                already++;
                continue;
            } else if (second < numbers[i]) {
                second = numbers[i];
            }
        }
        
        answer = max*second;
        
        return answer;
    }
}