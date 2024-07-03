class Solution {
    public int solution(int n) {
        int answer = 0;
        int num;
        for (int i=4; i<=n ; i++) {
            num = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    num++;
                    if (num >= 3) {
                        answer++;
                        break;
                    }
                }
            }
        }
        
        return answer;
    }
}