class Solution {
    public int solution(int a, int b, int c) {
                int answer = 0;
        int result1 = a+b+c;
        int result2 = result1 * ((a*a) + (b*b) +(c*c));
        if (a == b && a == c) {
        	answer = result2 * ((a*a*a)+(b*b*b)+(c*c*c));
        } else if (a == b && a != c ) {
        	answer = result2;
        } else if (a != b && a == c) {
        	answer = result2;
        } else if (a != b && b == c) {
        	answer = result2;
        } else if (a != c && b == c) {
        	answer = result2;
        }else {
            answer = result1;
        }
        
        return answer;
    }
}