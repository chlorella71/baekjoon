class Solution {
    String americano= "americano";
    String cafelatte = "cafelatte";
    String anything = "anything";
    
    public int solution(String[] order) {
        int answer = 0;
        
        for (int i = 0; i <order.length; i++) {
            answer += sell(order[i]);
        }
        return answer;
    }
    
    public int sell(String name) {
        int price = 0;

        for (int i =0; i< name.length(); i++) {
            if ((americano.length() + i) <= name.length()) {
                if (name.charAt(i) == 'a' && name.charAt(i+1) == 'm') {
                    for(int j = 2; j<americano.length(); j++) {
                        if (name.charAt(i+j) == americano.charAt(j)) {
                            if (j == americano.length() - 1) {
                                price = 4500;
                                return price;
                            }
                            continue;
                        }
                        break;
                    }
                }
            } 
            

            if (i+ cafelatte.length() <= name.length()) {
                if (name.charAt(i) == 'c') {
                    for(int j = 0; j<cafelatte.length(); j++) {
                        if (name.charAt(i+j) == cafelatte.charAt(j)) {
                            if (j == cafelatte.length() - 1) {
                                price = 5000;
                                return price;
                            }
                            continue;
                        }
                        break;
                    }
                }   
            }
            

            if (i+ anything.length() <= name.length()) {
                if (name.charAt(i) == 'a' && name.charAt(i+1) == 'n') {
                    for(int j = 2; j<anything.length(); j++) {
                        if (name.charAt(i+j) == anything.charAt(j)) {
                            if (j == anything.length() - 1) {
                                price = 4500;
                                return price;
                            }
                            continue;
                        }
                        break;
                    }
                }
            }
            
        }
        return price;
    }
}