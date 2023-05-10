class Solution {
    public int solution(String myString, String pat) {
         int answer = 0;
        char[] arr = myString.toCharArray();
        char[] result = new char[myString.length()];
        for(int i=0; i<myString.length();i++) {
        	if(arr[i] == 'A') {
        		result[i] = 'B';
        	} else if(arr[i] == 'B') {
        		result[i] ='A';
        	}
        }
        System.out.println(result);
 
        String result2 = new String(result); 
        
        if(result2.contains(pat)) {
        	answer =1;
        }
        
        return answer;
    }
}