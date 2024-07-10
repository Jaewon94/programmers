class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        String[] array = control.split("");
        
        for (int i=0; i<array.length; i++) {
            if (array[i].equals("w")) {
                answer++;
            } else if (array[i].equals("s")) {
                answer--;
            } else if (array[i].equals("d")) {
                answer += 10;
            } else if (array[i].equals("a")) {
                answer -= 10;
            }
        }
        
        return answer;
    }
}