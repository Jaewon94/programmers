class Solution {
    public int solution(int a, int b) {
        int answer = Integer.parseInt(a+""+b);
        if (answer < Integer.parseInt(b+""+a)) {
            answer = Integer.parseInt(b+""+a);
        }
        return answer;
    }
}