class Solution {
    public int[][] solution(int[][] arr) {
        int size = Math.max(arr.length, arr[0].length);
        String where = "";
        if (arr.length > arr[0].length) {
            where = "left";
        } else if (arr.length < arr[0].length) {
            where = "right";
        } else {
            where = "equal";
        }
        int[][] answer = new int[size][size];
        
        if (where.equals("left")) {
            for(int i=0; i < arr.length; i++) {
                for (int j=0; j<arr.length; j++) {
                    answer[i][j] = j < arr[i].length ? arr[i][j] : 0;
                }
            }
        } else if (where.equals("right")) {
            for (int i=0; i< arr.length; i++) {
                for(int j=0; j<arr[i].length; j++) {
                    answer[i][j] = j < arr[i].length ? arr[i][j] : 0;
                }
            }
        } else {
            answer = arr;
        }
        return answer;
    }
}