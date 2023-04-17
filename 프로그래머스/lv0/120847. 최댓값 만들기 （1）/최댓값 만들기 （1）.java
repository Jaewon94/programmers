class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int big1 = numbers[0];
        for (int i=0; i < numbers.length;i++) {
            if (big1 < numbers[i]) {
                big1 = numbers[i];
            }
        }
        int big2 = 0;
        for (int i=0; i < numbers.length ;i++) {
            if (big1 != numbers[i] && big2 < numbers[i] ){
                big2 = numbers[i];
            } 
        }
        if (big2 == 0) {
            big2 = numbers[numbers.length-1];
        }
        answer = big1 * big2;
        return answer;
    }
}