class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long spend = 0;
        long sum = 0;
        
        for (int i=1; i<=count; i++) {
            spend += price * i;
        }
        sum = money - spend;
        
        if (sum > 0) {
            answer = 0;
        } else {
            answer = Math.abs(sum);
        }

        return answer;
    }
}