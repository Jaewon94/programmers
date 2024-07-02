class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= '1' && my_string.charAt(i) <= '9') {
                System.out.println("my_string.charAt(i) = " + my_string.charAt(i));
                sum += my_string.charAt(i) -48;
            }
        }
        return sum;
    }
}