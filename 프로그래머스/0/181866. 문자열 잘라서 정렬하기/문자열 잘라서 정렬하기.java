import java.util.*;

class Solution {
    public List solution(String myString) {
        List list = new ArrayList();
        String[] split = myString.split("x");
        System.out.println(Arrays.toString(split));

        for(int i=0; i<split.length; i++){
             if (!split[i].isEmpty()) {
                list.add(split[i].trim());
            }
        }

        Collections.sort(list);
        return list;
    }
}