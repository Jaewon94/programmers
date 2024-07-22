class Solution {
    public int solution(int n) {
        int answer = 0;
        int number = 1;
        int pizza = 6;
        boolean isTrue = true;
        while (isTrue) {
            if (pizza % n == 0) {
                answer = number;
                isTrue = false;
            } 
            pizza += 6;
            number++;
        }
        return answer;
    }
}