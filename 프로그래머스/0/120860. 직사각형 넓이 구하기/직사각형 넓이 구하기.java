class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int xMax, xMin, yMax, yMin;
        
        xMax = dots[0][0];
        xMin = dots[0][0];
        yMax = dots[0][1];
        yMin = dots[0][1];
        
        for (int i = 1; i< dots.length; i++) {
            if (xMax < dots[i][0]) {
                xMax = dots[i][0];
            }
            if (xMin > dots[i][0]) {
                xMin = dots[i][0];
            }
        }
        
        for (int i = 1; i<dots.length; i++) {
            if (yMax < dots[i][1]) {
                yMax = dots[i][1];
            }
            if (yMin > dots[i][1]) {
                yMin = dots[i][1];
            }
        }
        
        int l, h;
        l = xMax - xMin;
        h = yMax - yMin;
        
        answer = l * h;
        if (answer < 0) {
            answer *= -1;
        }
        
        return answer;
    }
}