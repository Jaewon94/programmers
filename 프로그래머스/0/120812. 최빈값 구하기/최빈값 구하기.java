import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] temp = new int[1000];
        
        for (int i=0; i<array.length; i++) {
            temp[array[i]]++;
        }
        
        int max = temp[0];
        for (int i=0; i<temp.length; i++) {
            if (max < temp[i]) {
                max = temp[i];
                answer = i;
            }
        }
        
        for (int i=0; i<temp.length; i++) {
            if (max == temp[i] && answer != i) {
                answer = -1;
            }
        }
        
        
        
        return answer;
    }
}