class Solution {
    public int[] solution(String[] strlist) {
        int size = strlist.length;
        int[] answer = new int[size];
        int count=0;
        for(int i=0; i<strlist.length;i++) {
            count = strlist[i].length();
            answer[i] = count;
            count=0;
        }
        
        return answer;
    }
}