class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double a = 0;
        a = (num1 / (double)num2) * 1000;
        answer = (int)a;
        System.out.println(answer);

        return answer;
    }
}