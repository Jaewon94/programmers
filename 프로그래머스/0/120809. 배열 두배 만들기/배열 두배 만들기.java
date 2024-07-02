import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int[] numbers) {
        int[] answer = {};
        List list = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i] * 2);
        }
        return list;
    }
}