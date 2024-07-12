class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int min = sides[1];
        int minus = 0;
        
        for (int i=0; i<sides.length; i++) {
            if (max < sides[i]) {
                max = sides[i];
            }
            if (min > sides[i]) {
                min = sides[i];
            }
        }
        
        minus = max - min;
        for (int i=minus+1; i<=max; i++) {
            answer++;
        }
        
        for (int i = max +1; i < (max + min); i++){
            answer++;
        }
        
        
        return answer;
    }
}