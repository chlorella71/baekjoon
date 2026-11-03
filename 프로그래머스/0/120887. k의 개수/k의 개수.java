class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        int len = j - i + 1;
        
        for(int a = i; a <= j; a++) {
            String s = Integer.toString(a);
            for (int b = 0; b < s.length(); b++) {
                int x = s.charAt(b) - '0';
                if (x == k) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}