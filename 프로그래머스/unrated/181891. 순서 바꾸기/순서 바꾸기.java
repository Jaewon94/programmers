import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int[] arr1 = new int[n];
        int[] arr2 = new int[num_list.length - n];
        for(int i=0;i<arr1.length;i++) {
        	arr1[i] = num_list[i];
        }
        int j =0;
        for(int i=n;i <num_list.length;i++) {
        	arr2[j] = num_list[i];
        	j++;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
       
        for(int i=0; i<arr2.length;i++) {
        	answer[i] = arr2[i];
        }
        j=0;
        for(int i=arr2.length;i<answer.length;i++) {
        	answer[i] = arr1[j];
        	j++;
        }
        return answer;
    }
}