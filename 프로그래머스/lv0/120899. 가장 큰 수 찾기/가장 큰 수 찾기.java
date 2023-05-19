class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int big = array[0];
        for(int i=0; i< array.length;i++) {
            if(big < array[i]){
                big = array[i];
            }
        }
        int j=0;
        for(int i=0; i<array.length;i++) {
        	if(big == array[i]) {
        		answer[0] = big;
        		answer[1] =i;
        	} 
        }
        return answer;
    }
}