class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] aeiou = {'a','e','i','o','u'};
        
        boolean pass = false;
        
        for (int i = 0; i < my_string.length(); i++) {
            pass = false;
            for (int j = 0; j<aeiou.length; j++) {
                if (my_string.charAt(i) == aeiou[j]) {
                    pass = true;
                    break;
                }
            }
            if (pass == true) {
                continue;
            }
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}