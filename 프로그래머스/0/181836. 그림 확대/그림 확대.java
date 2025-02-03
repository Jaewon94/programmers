import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();
        
        for (int i=0; i < picture.length; i++) {
            char[] tempArr = picture[i].toCharArray();
            StringBuilder tempString = new StringBuilder();
            for(char c : tempArr) {
                for (int j = 0; j < k; j++) {
                    tempString.append(c);
                }
            }
            for (int j = 0; j < k; j++) {
                answer.add(tempString.toString());
            }
        }
        return answer;
    }
}