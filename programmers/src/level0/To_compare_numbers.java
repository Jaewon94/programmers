package level0;

class Solution2 {
    public int solution(int num1, int num2) {
        int answer = -1;
        if (num1 == num2) {
            answer = 1;
        }
        return answer;
    }
}

public class To_compare_numbers {
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		int num1 = 11;
		int num2 = 11;
		
		int result = s.solution(num1, num2);
		System.out.println(result);
	}
}
