class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = signs.length-1; i >= 0; i--) {
            if (signs[i] == false) {
                answer += -(absolutes[i]);
            } else {
                answer += absolutes[i];
            }
        }
        
        return answer;
    }
}