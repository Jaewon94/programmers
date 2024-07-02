import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int n, int[] numlist) {
        int[] answer = {};
        List list = new ArrayList();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
            }
        }
        return list;
    }
}