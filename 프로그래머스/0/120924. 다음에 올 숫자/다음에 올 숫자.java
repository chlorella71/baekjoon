class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        for (int i = 0; i< common.length; i++) {
            System.out.printf("%d, ", common[i]);
        }
        
        int x = common[1] - common[0];
        int y = common[2] - common[1];
        int z;
        if (common[0] != 0) {
            z = common[1]/common[0];
        } else {
            z = x;
        }
        
        
        if (x == y) {
            answer = common[common.length - 1] + x;
        } else {
            answer = common[common.length - 1]*z;
        }
            
        
        return answer;
    }
}