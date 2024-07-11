class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String temp = s.toLowerCase();
        int p = 0;
        int y = 0;
        
        for (int i=0; i<temp.length(); i++){
            if (temp.charAt(i) == 'p') {
                p++;
            } else if (temp.charAt(i) == 'y') {
                y++;
            }
        }
        
        if (p != y) {
            answer = false;
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}