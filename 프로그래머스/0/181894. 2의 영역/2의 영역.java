import java.util.*;

class Solution {
    public List solution(int[] arr) {
        int start = 0;
        int end = 0;

        List answer = new ArrayList();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }

        for (int i = arr.length -1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }

        for (int i = start; i <= end; i++) {
            if (start ==0 && end == 0) {
                answer.add(-1);
            }else {
                answer.add(arr[i]);
            }
        }
        
        return answer;
    }
}