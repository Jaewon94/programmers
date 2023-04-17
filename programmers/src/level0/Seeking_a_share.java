package level0;

class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }
}

public class Seeking_a_share {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		Solution s = new Solution();
		int result = s.solution(num1, num2);
		System.out.println(result);
	}
}
