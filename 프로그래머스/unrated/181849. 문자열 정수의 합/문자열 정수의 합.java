class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] arr = num_str.toCharArray();
        
        for(int i=0; i<num_str.length(); i++) {
        	if (arr[i] == '1') {
        		answer += 1;
        	} else if (arr[i] =='2') {
        		answer += 2;
        	}
        	else if (arr[i] == '3') {
        		answer += 3;
        	} else if (arr[i] =='4') {
        		answer += 4;
        	}
        	else if (arr[i] == '5') {
        		answer += 5;
        	} else if (arr[i] =='6') {
        		answer += 6;
        	}
        	else if (arr[i] == '7') {
        		answer += 7;
        	} else if (arr[i] =='8') {
        		answer += 8;
        	}
        	else if (arr[i] =='9') {
        		answer += 9;
        	}
        }
    
        return answer;
    }
}