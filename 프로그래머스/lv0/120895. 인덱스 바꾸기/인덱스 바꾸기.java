class Solution {
    public String solution(String my_string, int num1, int num2) {
               String answer = "";
        char[] arr = my_string.toCharArray();
        char[] arr2 = new char[arr.length];
        
        for(int i=0; i<arr2.length;i++) {
        	if(i == num1) {
        		arr2[i] = my_string.charAt(num2);
        	} else if (i == num2) {
        		arr2[i] = my_string.charAt(num1);
        	} else {
        		arr2[i] = arr[i];
        	}
        }
        
        for(int i=0; i<arr2.length;i++) {
        	answer += arr2[i];
        }
        
        
        return answer;
    }
}