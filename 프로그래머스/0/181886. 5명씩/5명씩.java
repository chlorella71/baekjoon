class Solution {
    public String[] solution(String[] names) {
        
        int cnt = 0;
        for (int i = 0; i < names.length; i+=5) {
            ++cnt;
        }
        String[] answer = new String[cnt];
        
        int idx = 0;
        for (int i = 0; i < names.length; i+=5) {
            answer[idx++] = names[i];
        }
        
        
        return answer;
    }
}