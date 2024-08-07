import java.util.*;

class Solution {
    public List solution(int[] arr, int divisor) {
        List answer = new ArrayList();
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}