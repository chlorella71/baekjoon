class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String orderString = String.valueOf(order);
        
        int cnt = 0;
        
        for (int i = 0 ; i < orderString.length(); i++) {
            if (orderString.charAt(i) == '0') {
                continue;
            }
            if ((orderString.charAt(i) - '0') % 3 == 0) {
                ++cnt;
            }
        }
        
        answer += cnt;
        
        return answer;
    }
}