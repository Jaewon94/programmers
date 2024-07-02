import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int[] array) {
        int max = 0;
        int index = 0;
        for(int i=0; i < array.length ; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        List list = new ArrayList();
        list.add(max);
        list.add(index);
        
        return list;
    }
}