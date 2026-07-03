class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int temp = 0;
        for (int i = 1; i <=n; i++) {
            long temp2 = 1;
            for (int j = 1; j<=i; j++) {
                temp2 *= j;
            }
            if (temp2 > temp && temp2 <=n) {
                temp = i;
            } else if (temp2 > n) {
                break;
            }
            
        }
        answer = temp;
        
        return answer;
    }
}