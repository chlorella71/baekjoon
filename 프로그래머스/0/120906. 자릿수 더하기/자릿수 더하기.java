class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String nToString = String.valueOf(n);
        
        
        for (int i = 0; i< nToString.length(); i++) {
            answer += (nToString.charAt(i) - '0');
        }
        
        return answer;
    }
}