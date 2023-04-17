class Solution {
    public String solution(String my_string) {
 	        String answer = "";
	        String tmp;

	        	 tmp = my_string.replaceAll("a", "");
	        	 tmp = tmp.replaceAll("o", "");
	        	 tmp = tmp.replaceAll("i", "");
	        	 tmp = tmp.replaceAll("u", "");
	        	 answer = tmp.replaceAll("e", "");

	        return answer;
    }
}