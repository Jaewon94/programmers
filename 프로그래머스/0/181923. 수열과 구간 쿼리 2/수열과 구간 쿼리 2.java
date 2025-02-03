class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int min = 0;
        
        for (int i = 0; i < queries.length; i++) {
            min = Integer.MAX_VALUE;
            boolean found = false;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2]) {
                    min = Math.min(min, arr[j]);
                    found = true;
                }
            }

            answer[i] = found ? min : -1;
        }

        return answer;
    }
}