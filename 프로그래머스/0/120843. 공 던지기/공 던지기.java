class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int j = 0;
        
         for (int i=0; i < k; i++) {
            answer = numbers[j];
            j++;
            if (numbers.length == j ){
                j = 0;
            }
            j++;
            if (numbers.length == j){
                j = 0;
            }
        }
        
        return answer;
    }
}