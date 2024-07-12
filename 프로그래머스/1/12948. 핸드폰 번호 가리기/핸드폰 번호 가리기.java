class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String temp = phone_number.substring(0, phone_number.length() - 4);
        System.out.println(temp);
        for (int i=0; i<temp.length(); i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);
        
        return answer;
    }
}