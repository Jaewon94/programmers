import java.util.Arrays;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] array = my_string.toCharArray();
        char temp;
        
        temp = array[num1];
        array[num1] = array[num2];
        array[num2] = temp;
        
        for (char c : array) {
            answer += c;
        } 
        return answer;
    }
}