import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.print(switchAtoa(a));
    }
    
    public static String switchAtoa(String a) {
        StringBuilder result = new StringBuilder();
        for (char ch : a.toCharArray()) {
            result.append(Character.isUpperCase(ch) ? Character.toLowerCase(ch) :
            Character.toUpperCase(ch));
        }
        return result.toString();
    }
}