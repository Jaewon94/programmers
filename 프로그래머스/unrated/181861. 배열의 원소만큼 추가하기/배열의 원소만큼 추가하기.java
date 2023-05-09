class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int size =0;
        for(int i=0; i<arr.length;i++) {
        	for(int j=0; j<arr[i];j++) {
        		size++;
        	}
        }
        int k =0;
        answer = new int[size];
        for(int i=0; i<arr.length;i++) {
        	for(int j=0; j<arr[i];j++) {
        		System.out.println(arr[i]);
        		answer[k] = arr[i];
        		k++;
        	}
        }
        System.out.println(size);
        return answer;
    }
}