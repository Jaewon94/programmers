class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int temp = 0;
        
        for (int i=0; i < numLog.length-1; i++) {
            temp = numLog[i+1] - numLog[i];
            
            if (temp == 1) {
                answer += "w";
            } else if (temp == -1) {
                answer += "s";
            } else if (temp == 10) {
                answer += "d";
            } else if (temp == -10) {
                answer += "a";
            }
        }
        
        return answer;
    }
}