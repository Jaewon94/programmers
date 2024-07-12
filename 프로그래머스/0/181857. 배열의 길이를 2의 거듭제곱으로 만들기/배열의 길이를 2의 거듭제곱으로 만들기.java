import java.util.*;

class Solution {
    public List solution(int[] arr) {
        List answer = new ArrayList();
        int diff =0;
        
        for (int i=0; i<arr.length; i++) {
                answer.add(arr[i]);
            }
        
        for (int i = 1; i < 10000; i=i*2) {
            if (arr.length > i) {
                continue;
            } else if (arr.length == i) {
                return answer;
            } else if (arr.length < i) {
                diff = i - arr.length;
                break;
            }
        }
        
        if (diff != 0) {
            
            for (int i=0; i<diff; i++) {
                answer.add(0);
            }
        }
        
        return answer;
    }
}