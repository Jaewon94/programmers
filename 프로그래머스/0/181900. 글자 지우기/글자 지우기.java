class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] array = my_string.toCharArray();

        for (int i=0; i<indices.length; i++) {
            array[indices[i]] = ' ';
        }

        for (int i=0; i<array.length; i++) {
            if (!(array[i] == ' ')) {
                answer += array[i];
            }
        }
        return answer;
    }
}