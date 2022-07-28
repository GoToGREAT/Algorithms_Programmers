import java.util.*;

/*
채점 결과
정확성: 42.1
효율성: 0.0
합계: 42.1 / 100.0
*/
public class P12936 {
	class Solution {
	    public int[] solution(int n, long k) {
	       int[] answer = new int[n];
	        long[] number = new long[n-1];
	        int[] num = new int[n];
	        
	        for(int i=0; i<n; i++) {
	        	num[i] = i+1;
	        }
	        
	        long cnt = 1;
	        number[n-2] = cnt++;
	        for(int i=n-3; i>-1; i--) {
	        	number[i] = (long) number[i+1]*cnt++;
	        }
	        
	         for(int i=0; i<n; i++) {
	        	Arrays.sort(num);
	        		        	
	        	if(i != n-1 && k!=1) {
	        		long qq = k/number[i]; // 몫
		        	int q = (int) qq;
		        	
		        	//System.out.println("k : "+k+" 몫은 : "+q+ " 그래서 answer[i] : "+num[q]);
		        	
		        	answer[i] = num[q]; // 넣기		        
		        	
		        	k -= qq*number[i];
		        	num[q] = n+1;		        	
		        	
	        	} else {
	        		answer[i]=num[0];
	        		num[0] = n+1;
	        	}
	        		        
	        }
	        	        
	        return answer;
	    }
	}
}
