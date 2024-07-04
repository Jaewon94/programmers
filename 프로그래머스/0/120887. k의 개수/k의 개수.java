class Solution {
    public int solution(int z, int y, int k) {
        int answer = 0;
        for (int i = z; i<= y; i++) {
            int x = i;
            if (x >= 10) {
                while (x > 0) {
                    if (x % 10 == k) {
                        answer++;
                    }
                    x /= 10;
                }
            } else {
                if (x == k) {
                    answer++;
                }
            }
        }
        return answer;
    }
}