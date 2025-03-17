class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        int strlength = str1.length() + str2.length();
        int j = 0;
        int k = 0;
        
        // if ( str1.length() > str2.length()) {
        //     strlength = str1.length();
        // } else {
        //     strlength = str2.length();
        // }
        
        for (int i = 0; i < strlength; i++) {
            if ( i % 2 ==0 ) {
                answer.append(str1.charAt(j++));
            } else {
                answer.append(str2.charAt(k++));
            }
        }
        
        return answer.toString();
    }
}