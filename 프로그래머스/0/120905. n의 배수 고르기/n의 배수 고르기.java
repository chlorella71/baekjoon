class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        int answerLength = 0;
        
        for (int i = 0; i< numlist.length; i++)  {
            if (numlist[i] % n == 0) {
                answerLength++;
            }
        }
        
        answer = new int[answerLength];
        
        int answerIndex = 0;
        for (int i = 0; i< numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[answerIndex++] = numlist[i];
            }
        }
        
        return answer;
    }
}