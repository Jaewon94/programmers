class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int plus =0;
        int times =1;
        for(int i=0;i<num_list.length;i++) {
            plus += num_list[i];
            times *= num_list[i];
        }
        plus = plus * plus;
        if (plus >= times ){
            answer = 1;
        }
        return answer;
    }
}