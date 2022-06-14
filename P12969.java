import java.util.Scanner;

public class P12969 {
	class Solution {
	    public void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        for(int i=0; i<b;i++){
	            for(int k=0; k<a; k++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}
}
