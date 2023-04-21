class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String s1 = my_string.substring(0,s);
        System.out.println(s1);
        answer = s1 + overwrite_string;
        String s2 = my_string.substring(s + overwrite_string.length() );
        System.out.println(s2);
        answer += s2;
        return answer;
    }
}