/*
채점 결과
정확성: 81.8
합계: 81.8 / 100.0

10,11번만 시간 초과
*/

public class P77885 {
	class Solution {
	    public long[] solution(long[] numbers) {
	    	long[] answer = new long[numbers.length];
	    	
	    	for(int i=0; i<numbers.length; i++) {
	    		long now = numbers[i];
	    		long next = now+1;
	    		while(true) {
	    			   long q= now^next;
	    			   String bi_q = Long.toBinaryString(q);
	    			   int cnt = bi_q.length()-bi_q.replace("1", "").length();
	    			   if(cnt==1 || cnt==2) break;
	    			   else next++;
	    		}
	    		answer[i] = next;	    		
	    	}	    	
	        return answer;
	    }
	}
}