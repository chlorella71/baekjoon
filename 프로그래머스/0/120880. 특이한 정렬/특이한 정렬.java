import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer;
        
        HashMap<Integer, Integer> nMap = new HashMap<>();
        
        for (int i = 0; i < numlist.length; i++) {
            int x = 0;
            if (numlist[i] > n) {
                x= numlist[i] - n;
            } else {
                x = n - numlist[i];
            }
            nMap.put(numlist[i], x);
        }
        
        for (int i :nMap.keySet()) {
            System.out.print("nMap: "+i +", ");
        }
        System.out.println();
        
        List<Map.Entry<Integer, Integer>> nMapList = new ArrayList<>(nMap.entrySet());
        
        nMapList.sort(Map.Entry.comparingByValue());
        
        for (int i =0; i <nMapList.size(); i++) {
            System.out.print("nMapList: "+ nMapList.get(i).getKey()+", ");
        }
        System.out.println();
        
        for (int i= 1; i <nMapList.size(); i++) {
            if (nMapList.get(i).getValue().equals(nMapList.get(i- 1).getValue())) {
                if (nMapList.get(i).getKey() > nMapList.get(i-1).getKey()) {
                    Collections.swap(nMapList, i, i-1);  
                }
            }
        }
        
        int[] aArr = new int[nMapList.size()];
        for (int i = 0; i<aArr.length; i++) {
            aArr[i] = nMapList.get(i).getKey();
        }
        
        for(int i : aArr) {
            System.out.print("aArr: "+i+", ");
        }
        
        answer = new int[aArr.length];
        
        for (int i =0; i<answer.length; i++) {
            answer[i] = aArr[i];
        }
        
        return answer;
    }
}