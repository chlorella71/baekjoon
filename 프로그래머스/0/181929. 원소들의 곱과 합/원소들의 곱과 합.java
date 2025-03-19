class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        for (int i = 0; i< num_list.length; i++) {
            a*=num_list[i];
        }
        for (int num : num_list) {
            b+= num;
        }
        b*=b;
        
        if ( a < b) {
            return 1;
        } else {
            return 0;
        }
        
        
        // return ;
    }
}