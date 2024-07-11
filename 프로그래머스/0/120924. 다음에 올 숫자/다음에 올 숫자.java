class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int diff =0;
        
        if (common[2] - common[1] == common[1] - common[0]) {
            diff = common[2] - common[1];
            answer = common[common.length-1] + diff;
        } else if (common[2] / common[1] == common[1] / common[0]) {
            diff = common[2] / common[1];
            answer = common[common.length-1] * diff;
        }
        
        return answer;
    }
}