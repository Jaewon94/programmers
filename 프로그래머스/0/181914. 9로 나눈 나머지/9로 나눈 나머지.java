class Solution {
    public int solution(String number) {
        int sum = 0;
         while(!number.isEmpty()) {
            sum = sum + Integer.parseInt(number.charAt(0) + "");
            number = number.substring(1);
        }
        
        return sum % 9;
    }
}