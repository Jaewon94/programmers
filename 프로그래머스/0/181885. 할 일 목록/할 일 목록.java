import java.util.*;

class Solution {
    public List solution(String[] todo_list, boolean[] finished) {
        List list = new ArrayList();
        
        for(int i=0; i<todo_list.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        return list;
    }
}