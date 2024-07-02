class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int ten = 0;
        
        if (n < 10) {
            answer = n * 12000 + k * 2000;
        } else if (n >= 10) {
            ten = n / 10;
            answer = n * 12000 + (k - ten) * 2000;
        }
        
        return answer;
    }
}