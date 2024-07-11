class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        int diff = 0;
        for (int i=1; i<=9; i++){
            sum += i;
        }
        
        for (int i=0; i<numbers.length;i++) {
            diff += numbers[i];
        }
        
        answer = sum - diff;
        return answer;
    }
}