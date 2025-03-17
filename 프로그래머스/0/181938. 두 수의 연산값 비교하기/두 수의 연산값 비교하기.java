class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sab = 0;
        try {
            sab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        } catch (NumberFormatException e) {
            System.out.println("문자를 숫자로 형변환 불가");
        }
        int ab2 = 2*a*b;
        
        answer = sab >= ab2 ? sab : ab2;
        
        
        return answer;
    }
}