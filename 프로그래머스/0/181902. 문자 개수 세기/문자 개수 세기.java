class Solution {
    public int[] solution(String my_string) {
        String[] eng = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o", "p","q","r","s","t","u","v","w","x","y","z"};
        
        int[] answer = new int[52];
        String[] split = my_string.split("");
        
        for (int i=0; i<split.length;i++) {
            for (int j=0; j<eng.length;j++) {
                if (split[i].equals(eng[j])) {
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}