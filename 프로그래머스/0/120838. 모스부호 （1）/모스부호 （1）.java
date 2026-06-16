import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        answer = morseToA(letter);
        
        
        return answer;
    }
    
    private String morseToA(String a) {
        
        int letter_size = 0;
        
        List<String> letter_list = new ArrayList<>();
        StringBuilder letters = new StringBuilder();
        
        int letter_point = 0;
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i) == ' ')) {
                for (int j = letter_point; j < i; j++) {
                    letters.append(a.charAt(j));
                }
                letter_list.add(letters.toString());
                letters.setLength(0);
                letter_point = i + 1;
            } else if ((i == (a.length() - 1))) {
                for (int j = letter_point; j <= i; j++) {
                    letters.append(a.charAt(j));
                }
                letter_list.add(letters.toString());
                letters.setLength(0);
                letter_point = i + 1;
            }
        }
        
        for (int i = 0; i < letter_list.size(); i++) {
            System.out.print(letter_list.get(i));
        }
        System.out.println();
        
        for (int i = 0; i<letter_list.size(); i++) {
            switch (letter_list.get(i)) {
                case ".-" -> letter_list.set(i, "a");
                case "-..." -> letter_list.set(i, "b");
                case "-.-." -> letter_list.set(i, "c");
                case "-.." -> letter_list.set(i, "d");
                case "." -> letter_list.set(i, "e");
                case "..-." -> letter_list.set(i, "f");
                case "--." -> letter_list.set(i, "g");
                case "...." -> letter_list.set(i, "h");
                case ".." -> letter_list.set(i, "i");
                case ".---" -> letter_list.set(i, "j");
                case "-.-" -> letter_list.set(i, "k");
                case ".-.." -> letter_list.set(i, "l");
                case "--" -> letter_list.set(i, "m");
                case "-." -> letter_list.set(i, "n");
                case "---" -> letter_list.set(i, "o");
                case ".--." -> letter_list.set(i, "p");
                case "--.-" -> letter_list.set(i, "q");
                case ".-." -> letter_list.set(i, "r");
                case "..." -> letter_list.set(i, "s");
                case "-" -> letter_list.set(i, "t");
                case "..-" -> letter_list.set(i, "u");
                case "...-" -> letter_list.set(i, "v");
                case ".--" -> letter_list.set(i, "w");
                case "-..-" -> letter_list.set(i, "x");
                case "-.--" -> letter_list.set(i, "y");
                case "--.." -> letter_list.set(i, "z");
            }
        }
        
        return String.join("", letter_list);
    }
}