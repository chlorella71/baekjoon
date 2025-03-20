class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        char[] ca = control.toCharArray();
        
        for (int i = 0; i < ca.length; i++) {
            switch (ca[i]) {
                case 'w':
                    n +=1;
                    break;
                case 's':
                    n -=1;
                    break;
                case 'a':
                    n -= 10;
                    break;
                case 'd':
                    n += 10;
                    break;
            }
        }
        
        return n;
    }
}