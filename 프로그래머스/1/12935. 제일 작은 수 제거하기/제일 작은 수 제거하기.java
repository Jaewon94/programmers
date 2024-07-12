import java.util.*;

class Solution {
    public List solution(int[] arr) {
        int min = arr[0];
        List answer = new ArrayList();
        
        for (int i=0; i<arr.length; i++) {
            answer.add(arr[i]);
        }
        
        for (int i=0; i<arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        for (int i=0; i< arr.length;i++){
            if (arr[i] == min) {
                answer.remove(i);
            }
        }
        
        if (answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer;
    }
}