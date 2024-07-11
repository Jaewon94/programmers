class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int temp = a;
        for (int i=0; i < included.length; i++) {
            if (included[i]) {
                answer += temp;
                System.out.println(answer);
            }
            temp += d;
        }
        return answer;
    }
}