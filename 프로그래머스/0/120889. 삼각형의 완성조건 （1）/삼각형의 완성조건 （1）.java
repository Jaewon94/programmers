class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int sum = 0;
        int index = 0;
        
        for (int i = 0; i<sides.length; i++) {
            sum += sides[i];
            if (max < sides[i]) {
                max = sides[i];
                index = i;
            }
        } 
        
        sum -= sides[index];
        
        if (max < sum) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        return answer;
    }
}