class Solution {
    public String[] solution(String my_string) {
         String[] answer = {};
        String[] answer2 = {};
        if (my_string.startsWith(" ")) {
        	my_string = my_string.substring(1, my_string.length());
        }
        while (my_string.contains("  ")) {
        	my_string = my_string.replace("  ", " ");
        }
        while(my_string.startsWith(" ")) {
        	my_string = my_string.substring(1, my_string.length()-1);
        }
        answer2 = my_string.split(" ");
        answer = new String[answer2.length];
        for(int i=0; i<answer2.length;i++) {
        	if (answer2[i].startsWith(" ")) {
        		answer[i] = answer2[i].substring(1, answer[i].length());
        	} else {
        		answer[i] = answer2[i];
        	}
        	
        }
        
        System.out.println(my_string);
        return answer;
    }
}