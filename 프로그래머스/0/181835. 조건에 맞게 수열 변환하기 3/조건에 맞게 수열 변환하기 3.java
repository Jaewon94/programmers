import java.util.*;

class Solution {
    public List solution(int[] arr, int k) {
        List answer = new ArrayList();
        for (int i =0; i<arr.length;i++) {
            if (k % 2 != 0) {
                answer.add(arr[i] * k);
            } else {
                answer.add(arr[i] + k);
            }
        }
        return answer;
    }
}