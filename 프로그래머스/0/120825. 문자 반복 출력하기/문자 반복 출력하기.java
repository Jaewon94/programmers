class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] temp = my_string.toCharArray();
    
        for (int i=0; i<my_string.length(); i++) {
            for (int j=0; j < n; j++) {
                answer += temp[i];
            }
        }
        return answer;
    }
}