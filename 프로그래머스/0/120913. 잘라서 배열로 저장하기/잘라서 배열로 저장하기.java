class Solution {
    public String[] solution(String my_str, int n) {
        
        int cnt = my_str.length()/n;
        System.out.println(cnt);
        
        String[] answer;
        
        if (my_str.length()% n == 0) {
             answer = new String[cnt];
        } else {
             answer = new String[cnt+1];
        }
        
        
        if (my_str.length()% n == 0) {
            for (int i= 0; i < cnt; i++) {
                answer[i] = my_str.substring(i*n, n *(i+1));
            }
        } else {
            for (int i= 0; i < cnt; i++) {
                answer[i] = my_str.substring(i*n, n *(i+1));
            }
            answer[cnt] = my_str.substring(cnt*n);
        }
        
        
        
        return answer;
    }
}