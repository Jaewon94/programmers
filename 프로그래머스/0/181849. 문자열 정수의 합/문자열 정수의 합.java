class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] split = num_str.split("");
        for (int i=0; i < split.length; i++) {
            answer += Integer.parseInt(split[i]);
        }
        return answer;
    }
}