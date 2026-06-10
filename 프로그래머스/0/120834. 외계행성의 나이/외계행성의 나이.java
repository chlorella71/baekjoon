import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        StringBuilder answer_builder = new StringBuilder();
        
        List<Integer> age_list = new ArrayList<>();
        
        if (age < 10) {
            age_list.add(age);
        } else {
            while (age >= 10) {
                age_list.add(age % 10);
                System.out.println(age_list.get(0));
                age /= 10;
                System.out.println(age);
                if (age < 10) {
                    age_list.add(age);
                }
            }
        }
        
        for (int i = 0; i < age_list.size()/2; i++) {
            int temp = age_list.get(i);
            age_list.set(i, age_list.get(age_list.size() - i - 1));
            age_list.set(age_list.size() - i - 1, temp);
        }
        
        // for (int i = 0; i < age_list.size(); i++) {
        //     System.out.print(age_list.get(i));
        // }
        
        for (int i = 0; i < age_list.size(); i++) {
            answer_builder.append(changeAgeToA(age_list.get(i)));
        }
        
        answer = answer_builder.toString();
        
        
        return answer;
    }
    
    private String changeAgeToA(int n) {
        String a = "";
        switch (n) {
            case 0:
                a = "a";
                break;
            case 1:
                a = "b";
                break;
            case 2:
                a = "c";
                break;
            case 3:
                a = "d";
                break;
            case 4:
                a = "e";
                break;
            case 5:
                a = "f";
                break;
            case 6:
                a = "g";
                break;
            case 7:
                a = "h";
                break;
            case 8:
                a = "i";
                break;
            case 9:
                a = "j";
                break;
        }
        return a;
    }
}