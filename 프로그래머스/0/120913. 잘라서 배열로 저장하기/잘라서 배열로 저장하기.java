import java.util.*;

class Solution {
    public List solution(String my_str, int n) {
        List list = new ArrayList();

        while (!my_str.isEmpty()) {
            int endIndex = Math.min(n, my_str.length());
            list.add(my_str.substring(0, endIndex));
            my_str = my_str.substring(endIndex);
        }

        return list;
    }
}