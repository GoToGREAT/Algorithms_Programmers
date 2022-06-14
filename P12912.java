public class P12912 {
	class Solution {
	    public long solution(int a, int b) {
	        if(a==b){
	            return a;
	        }
	        long answer = 0;
	        
	        int min = a>b ? b : a;
	        int max = min==a ? b : a;
	        
	        for(int i=min; i<max+1; i++){
	            answer += i ;
	        }
	        
	        return answer;
	    }
	}
}
