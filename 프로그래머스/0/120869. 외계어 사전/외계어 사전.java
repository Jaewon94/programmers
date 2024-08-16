class Solution {
    public int solution(String[] spell, String[] dic) {
          int answer = 2;

    for (int i = 0; i < dic.length; i++) {
      String temp = dic[i];
      String result = "";
      for (int j = 0; j < spell.length; j++) {
        temp = temp.replaceFirst(spell[j], "0");
      }
      for (int k = 0; k < spell.length; k++) {
        result += "0";
      }
      if (temp.equals(result)) {
        answer = 1;
      }
    }
        return answer;
    }
}