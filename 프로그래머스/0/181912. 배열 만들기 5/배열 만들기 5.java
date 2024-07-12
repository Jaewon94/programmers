import java.util.*;

class Solution {
    public List solution(String[] intStrs, int k, int s, int l) {
        List list = new ArrayList();
        List answer = new ArrayList();
        
        for (int i=0; i< intStrs.length; i++) {
            list.add(Integer.parseInt(intStrs[i].substring(s, s + l)));
        }
        for (int i=0; i<list.size(); i++) {
            if ((int)list.get(i) > k) {
                answer.add(list.get(i));
            }
        }
        
        return answer;
    }
}