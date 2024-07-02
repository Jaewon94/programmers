class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = my_string.toCharArray();
        
         for(int i = 0; i < array.length; i++){
            if (array[i] != 'a' && array[i] != 'o' && array[i] != 'e' && array[i] != 'i' && array[i] != 'u'){
                answer += array[i];
            }
        }
        
        return answer;
    }
}