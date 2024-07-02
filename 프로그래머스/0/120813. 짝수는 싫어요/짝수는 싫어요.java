import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int n) {
        List list = new ArrayList();
        
        for(int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }
        
        return list;
    }
}