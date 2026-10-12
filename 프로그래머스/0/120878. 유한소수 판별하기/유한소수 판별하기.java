import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int a1, b1;
        a1 = a;
        b1 = b;
        
        int bb, ss;
        if (a>=b) {
            bb = a;
            ss = b;
            
        } else {
            bb = b;
            ss = a;
        }
        
        int gcd = 1;
        for (int i = 1; i <=ss; i++) {
            if (a1%i == 0 && b1%i == 0) {
                gcd = i;
            }
        }
        a1 /= gcd;
        b1 /= gcd;
        System.out.println("기약분수: "+ a1 +", " + b1);
        
        List<Integer> b1List = new ArrayList<>();
        
        for (int i = 1; i <= b1; i++) {
            if (b1%i == 0) {
                b1List.add(i);
            }
        }
        
        System.out.print("분모약수: ");
        for (int num: b1List) {
            System.out.print(num+", ");
        }
        System.out.println();
        
        List<Integer> b2List = new ArrayList<>();
        
        int cnt;
        int cnt2;
        for (int i = 1; i < b1List.size(); i++) {
            cnt2 = 0;
            int x = b1List.get(i);
            for (int j = 2; j <= x/2; j++) {
                if (x%j == 0) {
                    cnt2++;
                }
                if (x == 4 && j ==2) {
                    System.out.println(cnt2);
                }
            }
            if (cnt2== 0) {
                b2List.add(b1List.get(i));
            }
        }
        
        System.out.print("분모약수중 소수: ");
        for (int num : b2List){
            System.out.print(num+", ");
        }
        
        answer = 1;
        for (int i = 0; i<b2List.size(); i++) {
            if(b2List.get(i) !=2 && b2List.get(i) != 5) {
                answer = 2;
            }
        }

        return answer;
    }
}