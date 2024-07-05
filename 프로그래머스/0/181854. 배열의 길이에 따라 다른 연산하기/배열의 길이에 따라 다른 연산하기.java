import java.util.*;

class Solution {
    public List solution(int[] arr, int n) {
        List list = new ArrayList();
        
        if (arr.length % 2 == 0) {
            for (int i=0; i<arr.length; i++) {
                if (i % 2 != 0 ) {
                    list.add(arr[i] + n);
                } else {
                    list.add(arr[i]);
                }
            }
        } else {
            for (int i=0; i<arr.length; i++) {
                if (i % 2 == 0 ) {
                    list.add(arr[i] + n);
                } else {
                    list.add(arr[i]);
                }
            }
        }
        
        return list;
    }
}