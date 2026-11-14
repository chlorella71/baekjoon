import java.util.*;

class Solution {
    public int solution(int[][] signals) {
        int answer = -1;
        
        int[] arr = new int[signals.length];
        
        for (int i = 0; i < signals.length; i++) {
            for (int j = 0; j < signals[i].length; j++) {
                arr[i] += signals[i][j];
            }
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        
        int min = 20;
        
        for (int i : arr) {
            if (min > i) {
                min = i;
            }
        }
        
        int max = 1;
        
        for (int i = 0; i <arr.length; i++) {
            max *= arr[i];
        }
        System.out.println(max);
        
        StringBuilder[] sb = new StringBuilder[signals.length];
        
        for (int i = 0; i< sb.length; i++) {
            sb[i] = new StringBuilder();
        }
    
        
        for (int i = 0; i<signals.length; i++) {
            for (int j = 0; j <signals[i].length; j++) {
                System.out.print(signals[i][j]+", ");
            }
            System.out.println();
        }
        
        int n = 0;
        
        while(n <= max) {
            for (int i = 0; i<signals.length; i++) {
                for (int j = 0; j<signals[i].length; j++) {
                    if (j==0) {
                        for (int k = 0; k <signals[i][j]; k++) {
                            sb[i].append("G");
                        }
                    } else if (j==1) {
                        for (int k = 0; k<signals[i][j]; k++) {
                            sb[i].append("Y");
                        }
                    } else if (j==2) {
                        for (int k = 0; k<signals[i][j]; k++) {
                            sb[i].append("R");
                        }             
                    }
                }
            }
            boolean y = true;
            for (int i = 0; i < sb.length; i++) {
                if (sb[i].charAt(n) != 'Y') {
                    y = false;
                    break;
                }
            }
            if (y == true) {
                answer = n+1;
                break;
            }
            n++;
            
        }
        
        
        
        return answer;
    }
}