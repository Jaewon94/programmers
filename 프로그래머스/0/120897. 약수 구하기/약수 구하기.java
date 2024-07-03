import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int n) {
        List answer = new ArrayList();
        
        for (int i=1; i<= n; i++) {
            if (n % i == 0) {
                answer.add(i);
            }
        }
        return answer;
    }
}