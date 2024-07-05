import java.util.*;

class Solution {
    public List solution(int[] num_list) {
        int[] answer = {};
         List list = new ArrayList();
        Arrays.sort(num_list);
        for (int i = 5; i < num_list.length; i++) {
            list.add(num_list[i]);
        }


        return list;
    }
}