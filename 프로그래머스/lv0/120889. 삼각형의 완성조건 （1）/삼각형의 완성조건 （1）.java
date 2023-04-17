import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int[] sort = sides;
        if (sort[2] < sort[0] + sort[1]){
            answer =1;
        } else {
            answer =2;
        }
        
        return answer;
    }
}