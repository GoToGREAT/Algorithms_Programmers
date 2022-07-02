

public class P12954 {
	class Solution {
		// long 처리가 안되서 테스트 13,14 오류
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        
	        for(int i=0; i<n; i++){
	            answer[i] = x+x*i;
	        }
	            
	        return answer;
	    }
	}
}
