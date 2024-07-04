class Solution {
    public long solution(String numbers) {
        long answer = 0;
           String[] arrays = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int[] intArrays = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        while (!numbers.isEmpty()) {
            for (int i = 0; i < arrays.length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    if (numbers.startsWith(arrays[j])) {
                        numbers = numbers.replaceFirst(arrays[j], "");
                        System.out.println("numbers = " + numbers);
                        answer = answer * 10 + intArrays[j];
                    }
                }


            }
        }


        return answer;
    }
}