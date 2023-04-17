class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int size = numbers.length;
        answer = new int[size];
        for (int i=0; i< numbers.length;i++){
            answer[i] = numbers[i] * 2;
        }
        
        return answer;
    }
}