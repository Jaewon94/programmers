class Solution {
    public String solution(String my_string) {
        String answer = "";
        String lowerCase = my_string.toLowerCase();
        char temp;
        char[] array = lowerCase.toCharArray();

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }

        return answer;
    }
}