import java.util.*;
class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        List<String> list = new ArrayList<String>();

        while(!code.isEmpty()) {

            if (code.length() < q) {
                list.add(code);
                code = "";
            } else {
                list.add(code.substring(0, q));
                code = code.substring(q);

            }

        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() <= r) {
                break;
            }
            String temp = list.get(i);
            answer += temp.charAt(r);
        }


        return answer;
    }
}