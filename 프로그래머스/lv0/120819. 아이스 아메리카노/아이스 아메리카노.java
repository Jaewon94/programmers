class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int ea=0;
        int change=0;
        if (money % 5500 >= 0) {
            ea = money / 5500;
            change = money % 5500;
        } 
        answer[0] = ea;
        answer[1] = change;
        return answer;
    }
}