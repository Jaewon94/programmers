import java.util.ArrayList;
import java.util.List;
class Solution {
    public List solution(int[] numbers, int num1, int num2) {
        List answer = new ArrayList();
        
        for (int i=0; i < numbers.length; i++) {
            if (num1 <= i && num2 >= i) {
                answer.add(numbers[i]);
            }
        }
        
        return answer;
    }
}