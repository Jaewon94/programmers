import java.util.*;

class Solution {
    public List solution(String[] strArr) {
        List answer = new ArrayList();
        
        for (int i=0; i<strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer.add(strArr[i]);
            }
        }
        
        return answer;
    }
}