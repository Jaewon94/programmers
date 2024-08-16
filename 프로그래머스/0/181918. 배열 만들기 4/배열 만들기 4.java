import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] arr) {
        ArrayList stk = new ArrayList();
        
        for (int i = 0; i < arr.length; ) {
      if (stk.toArray().length == 0) {
        stk.add(arr[i]);
        i++;
        continue;
      }
      if ((int) stk.get(stk.size() - 1) < arr[i]) {
        stk.add(arr[i]);
        i++;
      } else if ((int) stk.get(stk.size() - 1) >= arr[i]) {
        stk.remove(stk.size() - 1);
      }
    }
        
        return stk;
    }
}