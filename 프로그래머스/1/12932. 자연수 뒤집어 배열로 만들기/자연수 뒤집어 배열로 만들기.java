import java.util.*;

class Solution {
    public List solution(long n) {
        List answer = new ArrayList();
        
        while (n > 0) {
            answer.add(n % 10);
            n /= 10;
        }
        
        return answer;
    }
}