import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	       String a = sc.next();
	       
	       char[] arr = a.toCharArray();
	       String result="";
	       
	       for(int i=0;i<a.length();i++) {
	    	   if (arr[i] >= 'a' && arr[i] <='z') {
	    		   result += Character.toUpperCase(arr[i]);
	    	   } else if (arr[i] >='A' && arr[i] <='Z') {
	    		   result += Character.toLowerCase((arr[i]));
	    	   }
	       }
	       System.out.println(result);
    }
}