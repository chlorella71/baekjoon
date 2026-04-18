class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 1;
        
        for (int i=0; i<3; i++) {
            if (date1[i] < date2[i]) {
                answer = 1;
                return answer;
            } else if (date1[i] == date2[i]) {
                answer = 0;
                if (i == 3) {
                    return answer;
                }
                continue;
            } else if (date1[i] > date2[i]) {
                return answer = 0;
            }
        }
        
        return answer;
    }
}