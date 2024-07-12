class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String[] split = code.split("");
        for (int i=0; i<split.length; i++) {
            
            if (split[i].equals("1") && mode == 0) {
                mode = 1;
    
            } else if (split[i].equals("1") && mode == 1) {
                mode = 0;
             
            } else if (mode == 0 && i % 2 == 0) {
                answer += split[i];
            } else if (mode == 1 && i % 2 != 0) {
                answer += split[i];
            }
        } 
        if (answer.isEmpty()) {
            answer = "EMPTY";
        }
        
        
        
        return answer;
    }
}