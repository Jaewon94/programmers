class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char temp;
        char[] chars = before.toCharArray();
        char[] chars2 = after.toCharArray();

        for (int i = 0; i < chars.length -1 ; i++) {
            for (int j = i; j < chars.length; j++) {
                if (chars[i] > chars[j]) {
                    temp = chars[j];
                    chars[j] = chars[i];
                    chars[i] = temp;
                }
            }
        }

        String result ="";
        String result2 = "";
        for (int i = 0; i < chars.length ; i++) {
            result += chars[i];
        }

        for (int i = 0; i < chars2.length -1 ; i++) {
            for (int j = i; j < chars2.length; j++) {
                if (chars2[i] > chars2[j]) {
                    temp = chars2[j];
                    chars2[j] = chars2[i];
                    chars2[i] = temp;
                }
            }
        }
        for (int i = 0; i < chars2.length; i++) {
            result2 += chars2[i];
        }

        if (result.equals(result2)) {
            return 1;
        } else {
            return 0;
        }
    }
}