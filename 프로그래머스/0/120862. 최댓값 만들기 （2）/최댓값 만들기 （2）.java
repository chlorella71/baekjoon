class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int temp;
        for (int i = 0; i< numbers.length; i++) {
            for (int j = i; j< numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        // for (int i = 0; i< numbers.length; i++) {
        //     System.out.printf("%d, ", numbers[i]);
        // }
        
        int answer1 = numbers[0] * numbers[1];
        int answer2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        answer = answer1 > answer2 ? answer1 : answer2;
        
        return answer;
    }
}