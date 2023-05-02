class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[1+((num_list.length-1)/n)];
        int j=0;
        for(int i=0; i<num_list.length;i++) {
        	if (i ==0) {
        		answer[j] = num_list[i];
        		j++;
        	}else {
        		if(i%n ==0) {
        			answer[j] = num_list[i];
        			j++;
        		}
        	}
        }
        return answer;
    }
}