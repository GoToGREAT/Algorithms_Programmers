/*
넣어 줄 때부터 1234567 해주기
 */
public class P12914_1 {
	class Solution {
	    public long solution(int n) {
	    	if(n==1) return 1;
	    	else if(n==2) return 2;
	    	
	    	long[] arr = new long[n+1];
	    	arr[1] = 1;
	    	arr[2] = 2;
	    	
	    	for(int i=3; i<=n; i++) {
	    		arr[i] = (arr[i-2] +arr[i-1])%1234567;
	    	}
	        return arr[n];
	    }
	}
}