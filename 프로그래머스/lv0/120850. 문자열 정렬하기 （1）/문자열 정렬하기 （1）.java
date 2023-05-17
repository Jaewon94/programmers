import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
               int[] answer = {};
        String[] arr = {};
        String number="";
        String filter = "0123456789";
        for(int i=0;i<my_string.length();i++) {
        	String ch = my_string.charAt(i) + "";
        	if(filter.contains(ch)) {
        	number += ch;
        	}
        }
        arr = number.split("");
        System.out.println(Arrays.toString(arr));
        answer = new int[arr.length];
        for(int i=0; i<answer.length;i++) {
        	answer[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}