class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp=0;
        for (int i =0; i<array.length; i++) {
            temp = array[i];
            while (temp > 0) {
                if (temp % 10 == 7) {
                    answer++;
                }
                temp /= 10;
            }
        }
        return answer;
    }
}