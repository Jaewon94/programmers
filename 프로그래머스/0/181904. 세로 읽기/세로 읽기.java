class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        while (!my_string.equals("")) {
            answer += my_string.charAt(c -1);
            my_string = my_string.substring(m);
        }
        return answer;
    }
}