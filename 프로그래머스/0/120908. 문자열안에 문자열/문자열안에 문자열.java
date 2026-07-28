class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.substring(i, str2.length()+ i).equals(str2)) {
                return 1;
            }
        }
        
        return 2;
    }
}