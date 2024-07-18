import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List answer = new ArrayList();
        int one = 0;
        int two = 0;
        int three = 0;
        int result = 0;
        
        for (int i=0; i< rank.length; i++) {
            if (attendance[i]) {
                answer.add(rank[i]);
            }
        }
        
        Collections.sort(answer);
        
        for(int i = 0; i<3; i++) {
            for (int j=0; j<rank.length; j++) {
                if ((int)answer.get(i) == rank[j]) {
                        if (i == 0) {
                            one = j;
                        } else if(i == 1) {
                            two = j;
                        } else if (i == 2) {
                            three = j;
                        }
                }
                
            }
        }
        
        result = one * 10000 + two * 100 + three;
        
        System.out.println(result);
        
        
        return result;
    }
}