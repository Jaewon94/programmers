class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        
            for (int i = 0; i < queries.length; i++) {
      String temp = answer.substring(queries[i][0], queries[i][1] + 1);
      String reversed = new StringBuilder(temp).reverse().toString();

      String first = answer.substring(0, queries[i][0]);
      String last = answer.substring(queries[i][1] + 1);
      answer = first + reversed + last;
    }
        
        return answer;
    }
}