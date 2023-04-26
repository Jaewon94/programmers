class Solution {
    public int solution(int order) {
        int answer = 0;
        int sam;
        while(order !=0){
            sam = order % 10;
            if (sam == 3) {
                answer+=1;
            } else if (sam ==6) {
                answer +=1;
            } else if (sam ==9) {
                answer +=1;
            }
            order = order/10;
        }
        return answer;
    }
}