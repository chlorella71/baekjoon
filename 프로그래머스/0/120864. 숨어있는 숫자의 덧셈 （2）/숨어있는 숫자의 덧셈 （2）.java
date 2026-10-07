class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] mSArr = my_string.split("[a-z]|[A-Z]");
        
        int cnt = 0;
        for (int i = 0; i< mSArr.length; i++) {
            if (mSArr[i].equals("")) {
                continue;
            } else {
                cnt++;
            }
        }
        
        if (cnt == 0) {
            return 0;
        }
        
        String[] mSArr2 = new String[cnt];
        
        int idx = 0;
        for (int i = 0; i < mSArr.length; i++) {
            if (mSArr[i].equals("")) {
                continue;
            } else {
                mSArr2[idx++] = mSArr[i]; 
            }
        }
        
        for (String s : mSArr2) {
            System.out.println(s + ", ");
        }
        
        for (String s : mSArr2) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}