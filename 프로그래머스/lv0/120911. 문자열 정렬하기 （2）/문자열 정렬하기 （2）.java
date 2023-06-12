class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string = my_string.toLowerCase();
        char[] arr = my_string.toCharArray();

        for(int i=0; i < arr.length-1;i++) {
        	for(int j=i+1; j <arr.length;j++) {
        		if(arr[i] > arr[j]) {
        			char tmp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = tmp;
        		}
        	}
        }
        
        for(int i=0; i<arr.length;i++) {
        	answer += arr[i]+"";
        }
        
        return answer;
    }
}