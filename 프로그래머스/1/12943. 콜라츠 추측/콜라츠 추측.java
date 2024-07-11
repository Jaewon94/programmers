class Solution {
    public int solution(int num) {
        int answer = 0;
        Long temp = Long.parseLong(String.valueOf(num));
        
        while (temp != 1) {
            if (answer < 500) {
                if (temp % 2 == 0) {
                    answer++;
                    temp /= 2;
                } else if (temp % 2 != 0){
                    answer++;
                    temp = (temp*3) + 1;
                }
            } else {
                answer = -1;
                break;
            }
            
        }
        return answer;
    }
}