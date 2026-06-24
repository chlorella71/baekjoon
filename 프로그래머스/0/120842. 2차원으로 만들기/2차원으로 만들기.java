class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int answerCnt = 0;
        
        for (int i = 0; i < num_list.length; i+=n) { 
            int[] num_listArray = new int[n];
            for (int j = 0; j <n; j++) {
                num_listArray[j] = num_list[i+j];
                System.out.println(num_list[i+j]);
            }
            answer[answerCnt++] = num_listArray;
            System.out.printf("answerCnt = %d\n", answerCnt);
        }
        
        return answer;
    }
}