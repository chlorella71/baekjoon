class Solution {
    public int[] solution(int n) {
        int[] answer;
        
        int[] divideZero = new int[n];
        int cnt = 0;
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divideZero[cnt++] = i;
            }
        }
        
        int[] divideZeroOnly = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            divideZeroOnly[i] = divideZero[i];
            System.out.print(divideZero[i] +", ");
        }
        
        System.out.println();
        
        int[] divideSelf = new int[cnt];
        int cnt2 = 0;
        boolean divideAble = false;
        // i 이하 j로 i %j != 0이 아닌 수 => 소수 찾기
        for (int i = 1; i<cnt; i++) {
            divideAble = true;
            for (int j = 2; j <divideZeroOnly[i]; j++) {
                if (divideZeroOnly[i] % j ==0) {
                    divideAble = false;
                } 
            }
            if (divideAble == true) {
                divideSelf[cnt2++] = divideZeroOnly[i];
            } 
        }
        
        answer = new int[cnt2];
        
        for (int i = 0; i <cnt2; i++) {
            answer[i] = divideSelf[i];
        }
        
        return answer;
    }
}