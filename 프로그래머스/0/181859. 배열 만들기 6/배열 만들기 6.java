import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] arr) {
    ArrayList answer = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
      if (answer.toArray().length == 0) {
        answer.add(arr[i]);
        continue;
      }
      if ((int) answer.get(answer.size() - 1) == arr[i]) {
        answer.remove(answer.size() - 1);
      }else if ((int) answer.get(answer.size() - 1) != arr[i]) {
        answer.add(arr[i]);
      }
        
    }
        if (answer.toArray().length == 0) {
            answer.add(-1);
        }
        return answer;
    }
}