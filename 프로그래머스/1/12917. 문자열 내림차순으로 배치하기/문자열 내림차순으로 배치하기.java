import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List list = new ArrayList();
        char[] array = s.toCharArray();
        
        for (int i=0; i < array.length; i++) {
            list.add(array[i]);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0; i < list.size(); i++) {
            answer += list.get(i);
        }
        return answer;
    }
}