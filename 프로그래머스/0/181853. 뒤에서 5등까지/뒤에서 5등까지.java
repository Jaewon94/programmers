import java.util.*;

class Solution {
    public List solution(int[] num_list) {
        Arrays.sort(num_list);
        List list = new ArrayList();
        for (int i=0; i<5; i++) {
            list.add(num_list[i]);
        }
        return list;
    }
}