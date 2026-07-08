class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int temp = 0;
        int indexStart = 0;
        int indexTemp = 0;
        for (int i =0; i < s.length(); i++) {
            if(s.charAt(i) == 'Z') {
                answer -= temp;
                indexStart = i+2;
                System.out.println(indexStart);
                ++i;
            } else if (i == s.length() - 1) {
                answer += Integer.parseInt((s.substring(indexStart, i+ 1)));
            } else if (s.charAt(i) == ' ') {
                temp = Integer.parseInt((s.substring(indexStart, i)));
                answer += temp;
                indexTemp = indexStart;
                indexStart = i+1;
                System.out.println(temp);
            }
        }
        
        return answer;
    }
}