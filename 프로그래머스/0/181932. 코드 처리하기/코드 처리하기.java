class Solution {
    public String solution(String code) {
        String answer = "";
        
        int mode = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for ( int i = 0; i < code.length(); i++) {
            if ( mode == 0) {
                if (code.charAt(i) != '1' ) {
                    if (i % 2 == 0) {
                        sb.append(code.charAt(i));
                    }
                } else {
                    mode = 1;
                    continue;
                } 
            } else {
                if (code.charAt(i) != '1') {
                    if ( i % 2 == 1) {
                        sb.append(code.charAt(i));
                    }
                } else {
                    mode = 0;
                    continue;
                }    
            }
        }
        
        if (sb.length() == 0) {
            return "EMPTY";
        }
        return sb.toString();
    }
}