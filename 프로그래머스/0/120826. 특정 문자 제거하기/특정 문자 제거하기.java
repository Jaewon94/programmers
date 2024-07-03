class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] array = my_string.toCharArray();
        char[] c = letter.toCharArray();
         for (int i = 0; i< my_string.length(); i++) {
            if(!(array[i] == c[0])) {
                answer += array[i];
            }
        }
        return answer;
    }
}