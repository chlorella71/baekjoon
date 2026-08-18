class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        
        int x, y, xMax, yMax, xMin, yMin;
        xMax = board[0]/2;
        xMin = -1* (board[0]/2);
        yMax = board[1]/2;
        yMin = -1* (board[1]/2);
        
        
        for (int i = 0; i < keyinput.length; i++) {
            String n = keyinput[i];
            if ( n.equals("up")) {
                if (answer[1] == yMax) {
                    continue;
                }
                answer[1] += 1;
            } else if (n.equals("down")) {
                if (answer[1] == yMin) {
                    continue;
                }
                answer[1] -= 1;
            } else if (n.equals("right")) {
                if (answer[0] == xMax) {
                    continue;
                }
                answer[0] += 1;
            } else if (n.equals("left")) {
                if (answer[0] == xMin) {
                    continue;
                }
                answer[0] -= 1;
            }
        }
        
        return answer;
    }
}