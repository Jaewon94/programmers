import java.util.*;

class Solution {
    public List solution(String myString) {
        List answer = new ArrayList();
         String[] split = myString.split("x");
        System.out.println("split = " + Arrays.toString(split));

        for (int i = 0; i < split.length; i++) {
            answer.add(split[i].length());
        }

        if (myString.endsWith("x")) {
            answer.add(0);
        }
        
        
        return answer;
    }
}