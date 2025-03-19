class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        answer += a != b && a != c && b != c ? a+b+c :
            (a == b && a !=c) || (b == c && b != a) || (a ==c && a!=b) ? (a + b + c)*(a*a + b*b + c*c) :
            (a + b + c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c); 
        
        return answer;
    }
}