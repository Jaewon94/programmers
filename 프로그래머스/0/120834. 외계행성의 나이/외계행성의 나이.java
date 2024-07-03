import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(int age) {
        String answer = "";
        int one;
        char c;
        List list = new ArrayList();
        while (age > 0) {
            c = (char) (age % 10 + 97);
            list.add(c);
            age /= 10;
        }
        
        for (int i=list.size()-1; i>=0; i--) {
            answer += list.get(i);
        }
        
        
        

        return answer;
    }
}