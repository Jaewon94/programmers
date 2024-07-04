import java.util.*;

class Solution {
    public List solution(int[] emergency) {        
        int[] dup = emergency.clone();
        int[] reverse = new int[dup.length];
        List answer = new ArrayList();
        Arrays.sort(dup);
        

        for (int i = dup.length - 1, j=0; i >= 0; i--, j++) {
            reverse[j] = dup[i];
        }
        

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (reverse[j] == emergency[i]) {
                    answer.add(j+1);
                }
            }
        }
        
        return answer;
    }
}