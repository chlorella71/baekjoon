class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i< babbling.length; i++) {
            String a = babbling[i].replace("aya","0")
                .replace("ye","0")
                .replace("woo","0")
                .replace("ma","0")
                .replace("0","");
            System.out.println(a);
            if (a.equals("")) answer++;
        }
        
        // for (int i = 0; i< babbling.length; i++) {
        //     if (babbling[i].length() < 2) {
        //         continue;
        //     } else if (babbling[i].length() == 2) {
        //         if (babbling[i].equals("ye") || babbling[i].equals("ma")) {
        //             answer++;
        //             continue;
        //         }
        //     } else if (babbling[i].length() == 3) {
        //         if (babbling[i].equals("aya") || babbling[i].equals("woo")) {
        //             answer++;
        //             continue;
        //         }
        //     } else {
        //         int idx = 0;
        //         while (idx > babbling[i].length()) {
        //             if (babbling[i].charAt(0) == 'a') {
        //                 babbling[i].substring(idx)
        //             }
        //         }
        //     }
        // }
        
        return answer;
    }
}