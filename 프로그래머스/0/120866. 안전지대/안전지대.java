class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        if (board.length == 1 && board[0].length == 1) {
            if (board[0][0] == 1) {
                return 0;
            } else {
                return 1;
            }
        }
        
        int[][] board2 = new int[board.length][];
        
        for (int i = 0; i<board2.length; i++) {
            board2[i] = board[i].clone();
        }
        
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j< board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
        
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j< board[i].length; j++) {
                if (board[i][j] == 1) {
                    // 첫줄 모서리
                    if (i ==0 && j == 0) {
                        board2[i][j] = 2;
                        board2[i+1][j] = 2;
                        board2[i+1][j+1] = 2;
                        board2[i][j+1] = 2;
                    } else if (i == 0 && j == board[i].length - 1) {
                        board2[i][j] = 2;
                        board2[i+1][j] = 2;
                        board2[i+1][j-1] = 2;
                        board2[i][j-1] = 2;
                    } else if ( i ==board[i].length- 1 && j == 0) {
                        board2[i][j] = 2;
                        board2[i][j+1] = 2;
                        board2[i-1][j] = 2;
                        board2[i-1][j+1] = 2;
                    } else if (i == board[i].length - 1 && j == board[i].length - 1) {
                        board2[i][j] = 2;
                        board2[i-1][j] = 2;
                        board2[i-1][j-1] = 2;
                        board2[i][j-1] = 2;
                    } else if (j == 0) {
                        board2[i-1][0] = 2;
                        board2[i-1][1] = 2;
                        board2[i][0] = 2;
                        board2[i][1] = 2;
                        board2[i+1][0] = 2;
                        board2[i+1][1] = 2;
                    }  else if (i == 0) {
                        board2[i+1][j -1] = 2;
                        board2[i+1][j] = 2;
                        board2[i+1][j +1] = 2;
                        board2[i][j -1] = 2;
                        board2[i][j +1] = 2;
                    } else if (j == board[i].length - 1) {
                        board2[i-1][j-1] = 2;
                        board2[i-1][j] = 2;
                        board2[i][j] =2;
                        board2[i][j-1] = 2;
                        board2[i+1][j-1] = 2;
                        board2[i+1][j] = 2;
                    } else if (i == board[i].length - 1) {
                        board2[i-1][j -1] = 2;
                        board2[i-1][j] = 2;
                        board2[i-1][j +1] = 2;
                        board2[i][j -1] = 2;
                        board2[i][j +1] = 2;
                    } else {
                        board2[i-1][j-1] = 2;
                        board2[i-1][j] = 2;
                        board2[i-1][j+1] = 2;
                        board2[i][j-1] = 2;
                        board2[i][j] = 2;
                        board2[i][j+1] = 2;
                        board2[i+1][j-1] = 2;
                        board2[i+1][j] = 2;
                        board2[i+1][j+1] = 2;
                    }
                }
            }
        }
        for (int i = 0; i <board2.length; i++) {
            for (int j = 0; j<board2[i].length; j++) {
                if (board2[i][j] == 0) {
                    ++answer;
                }
            }
        }
        
        System.out.println();
        System.out.println();
        
        for (int i = 0; i<board2.length; i++) {
            for (int j = 0; j<board2[i].length; j++) {
                System.out.print(board2[i][j] + " ");
            }
            System.out.println();
        }
        
        return answer;
    }
}