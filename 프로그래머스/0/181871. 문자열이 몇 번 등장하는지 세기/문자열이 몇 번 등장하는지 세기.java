class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int x = pat.length();
        int cnt = 0;
        
        for (int i= 0; i < myString.length(); i++) {
            if (myString.substring(i,x).equals(pat)) {
                cnt++;
            }
            x++;
            if (x >myString.length()) {
                return cnt;
            }
        }   
        
        
        return cnt;
    }
}