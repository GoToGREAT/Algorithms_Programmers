public class P12954_1 {
	class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        
	        for(int i=0; i<n; i++){
	            answer[i] = (long) x+x*i;
	        }
	            
	        return answer;
	    }
	}
}
