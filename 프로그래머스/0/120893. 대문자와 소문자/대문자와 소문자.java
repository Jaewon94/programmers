class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        for (int i=0; i < my_string.length(); i++) {
            if (array[i] >= 65 && array[i] <= 90) {
                answer += Character.toLowerCase(array[i]);
            } else if (array[i] >= 97 && array[i] <= 122) {
                answer += Character.toUpperCase(array[i]);
            }
        }
        return answer;
    }
}