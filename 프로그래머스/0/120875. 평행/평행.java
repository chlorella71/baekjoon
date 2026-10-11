class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int[] a, b, c, d;
        
        a = dots[0];
        b= dots[1];
        c = dots[2];
        d = dots[3];
        
        if (aa(a,b,c,d)) return 1;
        if (aa(a,c,b,d)) return 1;
        if (aa(a,d,b,c)) return 1;
        
    
        
        
        return answer;
    }
    
    private boolean aa(int[] a, int[] b, int[] c, int[] d) {
        return ((a[0] - b[0]) * (c[1] - d[1])) == ((a[1] - b[1]) * (c[0] - d[0]));
    }
}