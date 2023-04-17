class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        int size = (num2 - num1) + 1;
        answer = new int[size];
        int j=0;
        for (int i=num1; i <=num2;i++){
            answer[j] = numbers[i];
            j++;
        }
        
        return answer;
    }
}