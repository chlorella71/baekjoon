import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        StringBuilder numBuilder = new StringBuilder();
        
        for (int i = 0; i < numbers.length();) {
            switch (numbers.substring(i, i+2)) {
                case "ze" :
                    numBuilder.append("0");
                    i +=4;
                    break;
                case "on" :
                    numBuilder.append("1");
                    i+=3;
                    break;
                case "tw" :
                    numBuilder.append("2");
                    i+=3;
                    break;
                case "th" :
                    numBuilder.append("3");
                    i+=5;
                    break;
                case "fo":
                    numBuilder.append("4");
                    i+=4;
                    break;
                case "fi":
                    numBuilder.append("5");
                    i+=4;
                    break;
                case "si" :
                    numBuilder.append("6");
                    i += 3;
                    break;
                case "se":
                    numBuilder.append("7");
                    i += 5;
                    break;
                case "ei":
                    numBuilder.append("8");
                    i += 5;
                    break;
                case "ni":
                    numBuilder.append("9");
                    i+= 4;
                    break;
            }
            // if (numbers.substring(i, i+2) == "ze") {
            //     engToNum += "0";
            //     i+=4;
            // } else if (numbers.substring(i, i+2) == "on") {
            //     engToNum += "1";
            //     i+=3;
            // } else if (numbers.substring(i, i+2) == "tw") {
            //     engToNum += "2";
            //     i+=3;
            // } else if (numbers.substring(i, i+2) == "th") {
            //     engToNum += "3";
            //     i+=5;
            // } else if (numbers.substring(i, i+2) == "on") {
            //     engToNum += "1";
            //     i+=3;
            // } else if (numbers.substring(i, i+2) == "on") {
            //     engToNum += "1";
            //     i+=3;
            // } else if (numbers.substring(i, i+2) == "on") {
            //     engToNum += "1";
            //     i+=3;
            // } else if (numbers.substring(i, i+2) == "on") {
            //     engToNum += "1";
            //     i+=3;
            // } else if (numbers.substring(i, i+2) == "on") {
            //     engToNum += "1";
            //     i+=3;
            // }
        }
        
        answer =Long.parseLong(numBuilder.toString());
        
        return answer;
    }
}