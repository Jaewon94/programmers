class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++ ) {
            sum += numbers[i];
        }
        answer = sum / (double)numbers.length;
        return answer;
    }
}