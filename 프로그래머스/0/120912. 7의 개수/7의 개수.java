class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i< array.length; i++) {
            char[] charArr = String.valueOf(array[i]).toCharArray();
            for (int j = 0; j<charArr.length; j++) {
                if (charArr[j] == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}