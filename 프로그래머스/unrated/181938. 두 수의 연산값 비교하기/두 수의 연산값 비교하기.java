class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sp = Integer.parseInt((a+""+b));
        int np = 2 * a * b;
        if (sp >= np) {
        	answer =sp;
        } else {
        	answer =np;
        }
        return answer;
    }
}