                                                        class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
      int[] answer = new int[2];
        int denom = denom1 * denom2;
        int numer = (numer1*(denom / denom1)) + (numer2 *(denom/denom2));
        

        int gcd = 1;
        for (int i = 1; i <= numer && i <= denom; i++) {
            if (numer % i == 0 && denom % i == 0) {
                gcd = i;
            }
        }
        numer = numer/gcd;
        denom = denom/gcd;
        
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
}