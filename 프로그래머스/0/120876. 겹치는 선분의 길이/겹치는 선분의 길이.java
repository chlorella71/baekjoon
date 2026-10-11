import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] a, b, c;
        a = lines[0];
        b= lines[1];
        c = lines[2];
        
        int min, max;
        if (a[0] <= b[0] && a[0]<= c[0]) {
            min = a[0];
        } else if (b[0] <= a[0] && b[0] <= c[0]) {
            min = b[0];
        } else {
            min = c[0];
        }
        System.out.println(a[0] +", " + b[0] +", " + c[0] + ", " + min);
        
        if (a[1] >= b[1] && a[1]>= c[1]) {
            max = a[1];
        } else if (b[1] >= a[1] && b[1] >= c[1]) {
            max = b[1];
        } else {
            max = c[1];
        }
        System.out.println(a[1] +", " + b[1] +", " + c[1] + ", " + max);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i= min; i<=max; i++) {
            map.put(i,0);
        }
        
        mapcnt(a, map);
        mapcnt(b, map);
        mapcnt(c, map);
        
        for (int v : map.values()) {
            if (v > 1) {
                System.out.print(v+ ", ");
                answer++;
            }
        }
        System.out.println();
        
        
        for (int k : map.keySet()) {
            if (map.get(k) > 1) {
                System.out.print(k + ", ");
            }
        }
        System.out.println();
        
        
        
        
        
        
        
        
        
        System.out.println(method(a, b));
        System.out.println(method(b, c));
        System.out.println(method(a, c));
        
        
        
        return answer;
    }
    
    private int method(int[] n, int[] y) {
        int[] a,b;
        if (n[1] <= y[1]) {
            a = n;
            b = y;
        } else {
            a = y;
            b= n;
        }
        if (a[0] <= b[0]&& b[0]<= a[1]) {
            if (a[1] <= b[1] ) {
                return a[1] - b[0];
            } else {
                return b[1] - b[0];
            }
        } else if (a[0] >= b[0] && a[0] <= b[1]){
            return a[1] - a[0];
        }
        return 0;
    }
    
    private void mapcnt(int[] a, HashMap<Integer, Integer> b) {
        for (int i = a[0]; i < a[1]; i++){
            if (b.containsKey(i)) {
                b.put(i, b.get(i) + 1);
            }
        }
    }
    
}