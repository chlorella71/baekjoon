class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] strArr = binomial.split(" ");
        int a = Integer.parseInt(strArr[0]); int b = Integer.parseInt(strArr[2]); char op = strArr[1].charAt(0);
        
        switch(op) {
            case '+':
                return answer = a + b;
            case '-':
                return answer = a - b;
            case '*':
                return answer = a * b;
        }
        
        return answer;
    }
}