class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int vir = 0;
        int hor = 0;
        int hei = 0;
        if (box[0] >= n) {
            vir = box[0]/n;
        }
        if (box[1] >= n) {
            hor = box[1]/n;
        }
        if (box[2] >= n) {
            hei = box[2]/n;
        }
        
        answer = vir * hor * hei;
        return answer;
    }
}