import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public List solution(String my_string) {
      char[] array = my_string.toCharArray();
        List list = new ArrayList();

        for (int i=0; i<array.length; i++) {
            if (array[i] >= '0' && array[i] <= '9') {
                list.add(array[i] - 48);
            }
        }

        Collections.sort(list);
        return list;
    }
}