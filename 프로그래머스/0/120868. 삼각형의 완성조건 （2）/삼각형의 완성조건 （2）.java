class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int b, s, p;
        
        if (sides[0] < sides[1]) {
            b = sides[1];
            s = sides[0];
        } else {
            b = sides[0];
            s = sides[1];
        }
        
        p = b+ s;
        
        for (int i = b-s +1; i < b; i++) {
            answer++;
            System.out.println(i);
        }
        
        for (int i = b; i <p; i++) {
            answer++;
            System.out.println(i);
        }
        
        return answer;
    }
}