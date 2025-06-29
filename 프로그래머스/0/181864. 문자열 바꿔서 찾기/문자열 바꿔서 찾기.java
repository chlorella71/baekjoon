

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str = "";
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                str += 'B';
            } else {
                str += 'A';
            }
        }
        
        System.out.println(str);
        
        for (int i = 0; i <str.length(); i++) {
            if (str.substring(i, str.length()).startsWith(pat)) {
                return 1;
            }
        }
        
        return 0;
    }
}