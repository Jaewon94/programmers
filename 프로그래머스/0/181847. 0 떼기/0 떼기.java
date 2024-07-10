class Solution {
    public String solution(String n_str) {
        String answer = n_str;
        
        while(n_str.startsWith("0")) {
            answer = n_str.substring(1);
            n_str = n_str.substring(1);
        }
        
        return answer;
    }
}