class Solution {
    public int solution(int num, int k) {
        String numToString = String.valueOf(num);
        int cnt = 0;
        
        for (int i = 0; i < numToString.length(); i++) {
            ++cnt;
            if (numToString.charAt(i) - '0' == k) {
                return cnt;
            }
        }
        
        return -1;
    }
}