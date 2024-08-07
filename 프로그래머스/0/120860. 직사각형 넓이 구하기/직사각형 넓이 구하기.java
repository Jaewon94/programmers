class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int ga = 0;
        int se = 0;
        
        for (int i=0; i<dots.length-1; i++) {
            if (dots[i][0] != dots[i+1][0]) {
                ga = Math.abs(dots[i][0] - dots[i+1][0]);
            }
            if (dots[i][1] != dots[i+1][1]) {
                se = Math.abs(dots[i][1] - dots[i+1][1]);
            }
        }
        answer = ga * se;
        return answer;
    }
}