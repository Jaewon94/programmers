import java.util.*;

class Solution {
    public List solution(String[] str_list) {
        List answer = new ArrayList();
        
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                for (int j = 0; j<i; j++) {
                    answer.add(str_list[j]);
                }
                break;
            } else if (str_list[i].equals("r")) {
                for (int j = i+1 ; j<str_list.length; j++) {
                    answer.add(str_list[j]);
                }
                break;
            }
        }
        
        System.out.println(answer);
        return answer;
    }
}