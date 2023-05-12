class Solution {
    public String solution(String my_string) {
 String answer = "";
        char result;
        char[] arr = my_string.toCharArray();
        for(int i=0; i < my_string.length();i++) {
        	if(arr[i] >= 'a' && arr[i] <='z') {
        		result = (char) (arr[i] - 32);
        		answer += result;
        	} else if(arr[i] >= 'A' && arr[i] <= 'Z') {
        		result = (char) (arr[i] + 32);
        		answer += result;
        	}
        }
        return answer;
    }
}