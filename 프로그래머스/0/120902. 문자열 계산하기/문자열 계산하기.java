class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split(" ");
        // String[] numberArr = my_string.split("[+-]");
        // String[] plusMinusArr = my_string.split("[0-9]");
        
        answer = Integer.parseInt(arr[0]);
        
        System.out.println(answer);
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i+1]);
                System.out.print("+");
            } else if (arr[i].equals("-")) {
                answer -= Integer.parseInt(arr[i+1]);
            }
        }
        
        return answer;
    }
}