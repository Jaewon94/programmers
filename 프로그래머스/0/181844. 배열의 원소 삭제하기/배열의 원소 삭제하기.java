import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List answer = new ArrayList();
        
        for (int i=0; i<arr.length; i++) {
            int temp = 0; 
            for (int j=0; j<delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    temp++;
                }
            }
            if (temp == 0) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}