class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] array = my_string.split(" ");
        
        for (int i=1; i< array.length; i+=2){
            if (array[i].equals("-")) {
                array[i+1] = String.valueOf(-(Integer.parseInt(array[i+1])));
            }
        }
        
        
        for (int i=0; i < array.length; i+= 2) {
            answer += Integer.parseInt(array[i]);
        }
        
        return answer;
    }
}