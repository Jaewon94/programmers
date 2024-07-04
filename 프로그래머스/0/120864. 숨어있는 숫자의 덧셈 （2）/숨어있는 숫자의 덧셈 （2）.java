import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
       String replace = my_string.replaceAll("[a-zA-Z]", " ");

        String[] array = replace.split(" ");
        System.out.println("array = " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (!(array[i].isEmpty())) {
                String temp = array[i].trim();
                answer += Integer.parseInt(temp);
            }
        }

        return answer;
    }
}