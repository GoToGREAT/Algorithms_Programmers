
public class P12947 {
	class Solution {
	    public boolean solution(int x) {
	        boolean answer = false;
	        int[] a = new int[5];
	        a[0]=x/10000;
	        a[1]=x%10000/1000;
	        a[2]=x%1000/100;
	        a[3]=x%100/10;
	        a[4]=x%10;    
	        int b = a[0]+a[1]+a[2]+a[3]+a[4];
	        if(x%b==0) answer = true;        
	        return answer;
	    }
	}
}
