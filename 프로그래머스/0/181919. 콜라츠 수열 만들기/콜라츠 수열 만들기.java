import java.util.*;

class Solution {
    public List solution(int n) {
        List answer = new ArrayList();
        
        answer.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                answer.add(n/2);
                n = n / 2;
                
            } else {
                answer.add(3 * n + 1);
                n = 3 * n + 1;
            }
            
        }
        
        return answer;
    }
}