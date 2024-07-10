import java.util.*;

class Solution {
    public List solution(String my_string) {
        List list = new ArrayList();

        for (int i = my_string.length() -1; i >= 0; i--) {
            list.add(my_string.substring(i, my_string.length()));
        }


        Collections.sort(list);
    
        return list;
    }
}