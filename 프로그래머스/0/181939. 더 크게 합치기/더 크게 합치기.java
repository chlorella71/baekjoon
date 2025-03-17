class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String sa = String.valueOf(a);
        String sb = String.valueOf(b);
        
        String sab = sa+sb;
        String sba = sb+sa;
        
        int iab = 0;
        int iba = 0;
        
        try {
            iab = Integer.parseInt(sab);
            iba = Integer.parseInt(sba);
        } catch (NumberFormatException e) {
            System.out.println("문자를 숫자로 형변환 불가능");
        }

        if ( iab >= iba) {
            return iab;
        } else {
            return iba;
        }
    }
}