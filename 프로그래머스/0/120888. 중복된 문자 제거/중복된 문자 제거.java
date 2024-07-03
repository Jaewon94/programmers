class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] my_char = my_string.toCharArray();

        for (int i = 0; i < my_char.length-1; i++) {
            for (int j = i + 1; j < my_char.length; j++) {
                if (my_char[i] == my_char[j]) {
                    my_char[j] = '`';
                }
            }
        }
        
        answer = String.valueOf(my_char);
        answer = answer.replace("`", "");
        return answer;
    }
}