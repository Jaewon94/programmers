import java.util.*;

class Solution {
    public List solution(int n) {
        Set set = new HashSet();
        int i = 2;
        
        while (n >= 2) {
            if (n % i == 0) {
                set.add(i);
                n = n / i;
                i = 2;
            }else if (n % i != 0) {
                i++;
            }
        }
        List list = new ArrayList(set);
        Collections.sort(list);
        
        return list;
    }
}