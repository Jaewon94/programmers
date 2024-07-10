import java.util.*;

class Solution {
    public List solution(String myStr) {
        List answer = new ArrayList();
        String s = myStr.replaceAll("[a-c]", " ");

         String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()) {
                answer.add(split[i]);
            }
        }
        
        if (answer.isEmpty()) {
            answer.add("EMPTY");
        }
        
        return answer;
    }
}