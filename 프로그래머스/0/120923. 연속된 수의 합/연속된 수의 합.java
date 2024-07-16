import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if (num % 2 != 0) {
            answer[num / 2] = total / num;
            for (int i=num/2+1; i< answer.length;i++) {
                answer[i] = answer[i-1] +1;
            }
            for (int i=num/2-1; i >= 0; i--) {
                answer[i] = answer[i+1] -1;
            }
            
        } else {
            answer[num / 2 - 1] = total / num;
            for (int i=num/2; i< answer.length;i++) {
                answer[i] = answer[i-1] +1;
            }
            for (int i=num/2-1; i >= 0; i--) {
                answer[i] = answer[i+1] -1;
            }
        }
        
        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}