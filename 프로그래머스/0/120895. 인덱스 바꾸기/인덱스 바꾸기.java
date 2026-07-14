class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char char1 = my_string.charAt(num1);
        char char2 = my_string.charAt(num2);
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1) {
                answer += String.valueOf(char2);
                continue;
            } else if(i == num2) {
                answer += String.valueOf(char1);
                continue;
            }
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}