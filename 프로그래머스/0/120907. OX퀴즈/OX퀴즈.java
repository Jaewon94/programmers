import java.util.*;

class Solution {
    public List solution(String[] quiz) {
        List answer = new ArrayList();
        int result = 0;
        
        for(int i=0; i < quiz.length; i++) {
            String[] split = quiz[i].split(" ");
            if (split[1].equals("-")) {
                result = Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
            } else {
                result = Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
            }
            
            if (result == Integer.parseInt(split[4])) {
                answer.add("O");
            } else if (result != Integer.parseInt(split[4])) {
                answer.add("X");
            }
        }
        return answer;
    }
}