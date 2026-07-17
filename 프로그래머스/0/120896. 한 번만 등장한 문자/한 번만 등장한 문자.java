import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder answerBuilder = new StringBuilder();
        
        HashMap<Character, Integer> answerMap = new HashMap<>();
        
        for (int i =0; i< s.length(); i++) {
            if (!answerMap.containsKey(s.charAt(i))) {
                answerMap.put(s.charAt(i), 1);
            } else if (answerMap.containsKey(s.charAt(i))) {
                answerMap.put(s.charAt(i), answerMap.get(s.charAt(i)) + 1);
            }
        }
        
        char[] answerArray = new char[answerMap.size()];
        
        int index = 0;
        for (char k: answerMap.keySet()) {
            if (answerMap.get(k) == 1) {
                answerArray[index++] = k;
            }
        }
        
        Arrays.sort(answerArray, 0, index);
        
        answer = new String(answerArray, 0, index);
        
        return answer;
    }
}