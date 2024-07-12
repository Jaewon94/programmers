import java.util.*;


class Solution {
    public List solution(String my_string) {
         List answer = new ArrayList();
        String trim = my_string.trim();
        System.out.println(trim);

        String[] split = trim.split(" ");
        System.out.println(Arrays.toString(split));

        for (int i = 0; i < split.length; i++) {
            if (!split[i].isEmpty()){
                answer.add(split[i]);
            }
        }
        return answer;
    }
}