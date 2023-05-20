import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length() ];
        int j= 0;
        for(int i=0; i<answer.length;i++){
            answer[i] = my_string.substring(i);
        }
        System.out.println(Arrays.toString(answer));
        Arrays.sort(answer);
        
        return answer;
    }
}