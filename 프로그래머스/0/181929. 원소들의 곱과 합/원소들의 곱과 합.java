class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int ti = 1;
        int sq = 0;
        
        for (int i=0; i< num_list.length; i++) {
            ti *= num_list[i];
            sq += num_list[i];
        }
        sq = sq * sq;
        
        System.out.printf("ti, sq = %d, %d", ti, sq);
        
        if (ti<sq) {
            answer =1;
        }
        return answer;
    }
}