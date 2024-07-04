import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] split = s.split(" ");
        System.out.println("split = " + Arrays.toString(split));
        int[] array = new int[split.length];
        
        for (int i = 0; i < array.length; i++) {
            if (split[i].equals("Z")) {
                array[i] = -(Integer.parseInt(split[i - 1]));
            } else {
                array[i] = Integer.parseInt(split[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }
        return answer;
    }
}