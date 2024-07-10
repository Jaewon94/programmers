class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String temp = myString;
        int range = 0;
        
        while(!myString.equals("")) {
            if (myString.endsWith(pat)) {
                if (range < myString.length()) {
                    range = myString.length();
                }
            }
            myString = myString.substring(0,myString.length()-1);
        }
        answer = temp.substring(0, range);
        return answer;
    }
}