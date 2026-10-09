import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        HashSet<String> a = new HashSet<>();
        
        for (int i = 0; i < dic.length; i++) {
            for (int j = 0; j < dic[i].length(); j++) {
                for (int k = 0; k <spell.length; k++) {
                    System.out.print(dic[i].charAt(j));
                    System.out.println(", " + spell[k].charAt(0));
                    if (dic[i].charAt(j) == spell[k].charAt(0)) {
                        a.add(spell[k]);
                        System.out.println(a);
                        if (!a.add(spell[k])) {
                            a.add(spell[k]);
                        } else {
                            return 2;
                        }
                    }
                }
                if (a.size() == spell.length) {
                    return 1;
                }
            }
            a.clear();
        }
        
        return answer;
    }
}