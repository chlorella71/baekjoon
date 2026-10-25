class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int c = chicken;
        int a = 0;
        int b = 0;
        
        do {
            a = c/10;
            b = c%10;
            answer+= a;
            c = a+b;
        } while (c >= 10);
        
        return answer;
    }
}