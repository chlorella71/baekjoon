class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] a = new int[100];
        
        int aIdx = 0;
        for (int i =1;;i++) {
            if (i % 3 == 0
               || (Integer.toString(i).contains("3"))) {
                continue;
            } else {
                a[aIdx++] = i;
                if (aIdx == 100) {
                    break;
                }
            }
        }
        
        answer = a[n-1];
        
        return answer;
    }
}