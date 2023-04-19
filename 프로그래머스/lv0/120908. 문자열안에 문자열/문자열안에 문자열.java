class Solution {
    public int solution(String str1, String str2) {
         int answer = 2;
	        String result;
	        for(int i=0;i<str1.length();i++) {
	        	if(str1.charAt(i) == str2.charAt(0)) {
	        		if (i <= str1.length() - str2.length()) {
	        			result = str1.substring(i, i+str2.length());
	        			if(result.equals(str2)) {
	        			answer =1;
	        		}
	        		}
	        		
	        		
	        	}
	        }
	        
	        return answer;
    }
}