import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer;
        
        double[] arr = new double[score.length];
        
        for (int i = 0; i<score.length; i++) {
            arr[i] = (score[i][0] + score[i][1]) /2.0;
        }
        
        for (double i : arr){
            System.out.print(i +", ");
        }
        
        double[] arr2 = Arrays.copyOf(arr, arr.length);
        
        // Arrays.sort(arr2);
        for (int i = 0; i<arr2.length; i++) {
            for (int j = i; j <arr2.length; j++) {
                double temp = 0;
                if (arr2[i] < arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        
        System.out.println();
        for (double i : arr2) {
            System.out.print(i + ", ");
        }
        
        int[] arr3 = new int[arr2.length];
        arr3[0] = 1;
        int cnt = 0;
        for (int i = 1; i<arr2.length; i++) {
            if (arr2[i] == arr2[i-1]) {
                arr3[i] = arr3[i-1];
                cnt++;
            } else {
                arr3[i] = arr3[i - 1] + 1 +cnt;
                cnt = 0;
            }
        }
        
        answer = new int[arr.length];
        
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j<arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    answer[i] = arr3[j];
                }
            }
        }
        
        
        
        return answer;
    }
}