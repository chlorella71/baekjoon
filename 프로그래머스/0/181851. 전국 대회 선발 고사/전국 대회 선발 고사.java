import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        List<Integer> stu_list = new ArrayList<Integer>();
        
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i] == true) {
                stu_list.add(Integer.valueOf(rank[i]));
            }
        }
        
        Collections.sort(stu_list);
        System.out.println(stu_list);
        
        for (int i = 0; i< stu_list.size(); i++) {
            for (int j = 0; j < rank.length; j++) {
                if (stu_list.get(i) == rank[j]) {
                    stu_list.set(i, Integer.valueOf(j));
                    break;
                }
            }
        }
        int a= stu_list.get(0);
        int b= stu_list.get(1);
        int c = stu_list.get(2);
        System.out.print(a+", "+b+", "+c);
        
        answer = 10000*a+100*b+c;
        
        return answer;
    }
}