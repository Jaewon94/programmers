class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int temp1 = Integer.parseInt(bin1, 2);
        int temp2 = Integer.parseInt(bin2, 2);
        
        int sum = temp1 + temp2;
        
        answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}