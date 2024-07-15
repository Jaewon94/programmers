class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String temp ="";
        
        if (A.equals(B)) {
            return 0;
        }
        
        for (int i=0; i<A.length(); i++) {
            temp = A.substring(A.length()-1, A.length());
            A = temp + A.substring(0, A.length()-1);
            System.out.println(A);
            if (B.equals(A)) {
                return i + 1;
            }
        } 
        
        return answer;
    }
}