import java.util.*;

class Solution {
    public List solution(int l, int r) {
         boolean isTrue = true;

        List answer = new ArrayList();

        for (int i=l; i<=r; i++) {
            if (i % 5 ==0) {
                isTrue = true;
                String s = String.valueOf(i);
                String[] split = s.split("");

                for (int j=0; j<split.length; j++) {
                    if (!(split[j].equals("0") || split[j].equals("5"))) {
                        isTrue = false;
                        break;
                    }
                }

                if (isTrue) {
                    answer.add(i);
                }
            }
        }
        
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        return answer;
    }
}