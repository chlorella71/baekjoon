class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int temp = 0;
        for (int i = 0; i < sides.length; i++) {
            for (int j = 1; j < sides.length; j++) {
                if (sides[j] > sides[i]) {
                    temp = sides[i];
                    sides[i] = sides[j];
                    sides[j] = temp;
                }
            }
        }
        
        for (int i : sides) {
            System.out.println(i);
        }
        
        if (sides[0] >= (sides[1] + sides[2])) {
            answer = 2;
        } else {
            answer = 1;
        }
        
        return answer;
    }
}