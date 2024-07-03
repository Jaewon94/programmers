import java.util.ArrayList;
import java.util.List;
class Solution {
    public List solution(int[] numbers, String direction) {
        
        List list = new ArrayList();
        
        if (direction.equals("right")) {
            list.add(numbers[numbers.length-1]);
            for (int i=0; i<numbers.length-1; i++) {
                list.add(numbers[i]);
            }
        } else if (direction.equals("left")) {
            for (int i=1; i<numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }
        
      
        
        return list;
    }
}