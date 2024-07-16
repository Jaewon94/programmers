class Solution {
    public int solution(String s) {
        int answer = 0;
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        String[] sNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<10; i++) {
            for (int j=0; j<numbers.length; j++) {
                if (s.contains(sNumbers[i])) {
                    s = s.replaceAll(sNumbers[i], String.valueOf(numbers[i]));
                }
            }
        }
        
        answer = Integer.parseInt(s);

        return answer;
    }
}