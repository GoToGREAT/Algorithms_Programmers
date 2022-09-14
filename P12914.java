/*
채점 결과
정확성: 37.5
합계: 37.5 / 100.0
 */
public class P12914 {
	class Solution {
	    public long solution(int n) {
	    	if(n==1) return 1;
	    	else if(n==2) return 2;
	    	
	    	long[] arr = new long[n+1];
	    	arr[1] = 1;
	    	arr[2] = 2;
	    	
	    	for(int i=3; i<=n; i++) {
	    		arr[i] = arr[i-2]+arr[i-1];
	    	}
	        return arr[n]%1234567;
	    }
	}
}