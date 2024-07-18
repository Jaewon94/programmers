import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] clone = new int[arr.length];
        boolean isTrue = true;
        
        while (!Arrays.equals(arr, clone)) {
            
            for (int i=0; i<arr.length; i++) {
                clone[i] = arr[i];
            }
            
            for (int i=0; i< arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 ==0) {
                    arr[i] = arr[i]/2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            answer++;
        }
       
        
        
        
        return --answer;
    }
}