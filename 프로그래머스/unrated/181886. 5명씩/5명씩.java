class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int size = 0;
        if(names.length % 5 == 0) {
        	size = (names.length/5);
        } else if(names.length /5 != 0) {
        	size = (names.length/5)+1;
        }
        System.out.println(size);
        answer = new String[size];
        int j=0;
        for(int i=0; i<names.length;i++) {
        	if(i==0) {
        		answer[j] = names[i]; 
        		j++;
        	}
        	else if (i % 5 == 0) {
        		answer[j] = names[i];
        		j++;
        	}
        }
        return answer;
    }
}