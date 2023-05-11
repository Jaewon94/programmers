import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        ArrayList<Integer> list = new ArrayList<>();
      
        for (int i=0; i <num_list.length;i++) {
        	list.add(num_list[i]);
        }
        list.sort(null);
        for(int i=0;i<answer.length;i++) {
        	answer[i] = list.get(i);
        }
        
        System.out.println(list);
        return answer;
    }
}