import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        
        int a= -1, b= -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                a = i;
                System.out.println("a= "+ a);
                break;
            }
        }
        
        
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 2) {
                b = i;
                System.out.print("b= "+ b);
                break;
            }
        }
        
        if ( a== -1) {
            return new int[] {-1};
        }
        
        return Arrays.copyOfRange(arr, a, b+1);
    }
}