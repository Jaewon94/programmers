class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length;i++){
            if (arr[i] >= 50 && arr[i] %2 == 0 ) {
                answer[i] = arr[i]/2;
            }else {
                answer[i] = arr[i];
            } 
            if (arr[i] < 50 && arr[i] %2 != 0) {
                answer[i] = arr[i] *2;
            }
        }
        return answer;
    }
}