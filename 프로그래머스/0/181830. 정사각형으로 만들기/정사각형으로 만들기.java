class Solution {
    public int[][] solution(int[][] arr) {
        int answer_length = arr.length;
        
        stop:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length > arr.length) {
                    answer_length = arr[i].length;
                    break stop;
                }
            }
        }
        
        int[][] answer = new int[answer_length][answer_length];
    
        for (int i =0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}