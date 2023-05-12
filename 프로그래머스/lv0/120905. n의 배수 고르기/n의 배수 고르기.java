import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<numlist.length;i++) {
        	if(numlist[i] % n == 0) {
        		list.add(numlist[i]);
        	}
        }
        answer = new int[list.size()];
        for(int i=0; i<answer.length;i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}