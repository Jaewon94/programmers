class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
         char[] array = my_string.toCharArray();

        for (int j = 0; j < index_list.length; j++) {
            answer += array[index_list[j]];
            
        }
        return answer;
    }
}