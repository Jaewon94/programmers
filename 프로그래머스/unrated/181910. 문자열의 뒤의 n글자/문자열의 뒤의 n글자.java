class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int size = my_string.length();
        size = size - n;
        answer = my_string.substring(size);
        return answer;
    }
}