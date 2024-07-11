import java.util.*;

class Solution {
    public List solution(int x, int n) {
        List answer = new ArrayList();
        Long plus = Long.parseLong(String.valueOf(x));
        Long minus = Long.parseLong(String.valueOf(x));
        
        for(int i=0; i<n; i++) {
            
            if (x > 0) {
                answer.add(plus);
                plus += x;
            } else if (x < 0) {
                answer.add(minus);
                minus += x;
            } else {
                answer.add(0);
            }
            
            
        }
        
        return answer;
    }
}