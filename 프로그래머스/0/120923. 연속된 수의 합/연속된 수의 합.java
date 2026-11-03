class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int x = total/num;
        int y = num/2;
        
        System.out.println(x);
        System.out.println(y);
        
        int idx = 0;
        for (int i = x - y; i <= x+y; i++) {
            if (num% 2 == 0) {
                if ((x-y) == i) {
                    continue;
                }
            }
            answer[idx++] = i;
        }
        
        return answer;
    }
}