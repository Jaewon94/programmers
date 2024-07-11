class Solution {
    public long solution(long n) {
        long answer = -1;
        for (Long i=1l; i< 10000000; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
            }
        }
        return answer;
    }
}