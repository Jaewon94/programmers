import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(String[] strlist) {
        List list = new ArrayList();
        int result = 0;
        for (int i=0; i<strlist.length; i++ ) {
            for (int j=0; j < strlist[i].length(); j++) {
                result++;
            }
            list.add(result);
            result = 0;
        }
        return list;
    }
}