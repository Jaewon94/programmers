class Solution {
    public int solution(String message) {
       int answer = 0;
	        char[] arr = message.toCharArray();
	        for(int i =0; i<arr.length;i++) {
	        	for(int j=0;j<2;j++) {
	        		answer++;
	        	}
	        }
	        return answer;
    }
}