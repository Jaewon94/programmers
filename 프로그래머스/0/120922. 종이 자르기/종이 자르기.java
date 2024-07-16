class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        if (M ==1 && N == 1) {
            return 0;
        }
        
        answer = Math.abs(0 - M +1) + (Math.abs(0 - N + 1) * M);
        
        return answer;
    }
}