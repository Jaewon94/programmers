class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int size=0;
        for (int i=0; i<=n;i++){
            if(i%2 != 0) {
                size++;
            }
        }
        
        int j=0;
        answer = new int[size];
        for(int i=0; i<=n;i++) {
            if (i % 2 !=0) {
                answer[j] = i;
                j++;
            }
        }
        return answer;
    }
}