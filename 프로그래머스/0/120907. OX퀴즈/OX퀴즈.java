import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        String[][] quizArr = new String[quiz.length][5];
        
        for (int i =0; i< quizArr.length; i++) {
            quizArr[i] = quiz[i].split(" ");
            System.out.println(Arrays.toString(quizArr[i]));
        }
        
        for (int i= 0; i< quizArr.length; i++) {
            for (int j = 0; j<quizArr[i].length; j++) {
                int x = Integer.parseInt(quizArr[i][0]);
                int y = Integer.parseInt(quizArr[i][2]);
                int z = Integer.parseInt(quizArr[i][4]);
                if (quizArr[i][1].equals("-")) {
                    if (x - y == z) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                } else if (quizArr[i][1].equals("+")) {
                    if (x + y == z) {
                        answer[i] = "O";
                    } else {
                        answer[i] = "X";
                    }
                }
            }
        }
        
        return answer;
    }
}