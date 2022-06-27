import java.util.Arrays;
import java.util.List;

public class P42626 {
	class Solution {
	    public int solution(int[] scoville, int K) {
	    	int answer = 0;
	    	int sco;
	    	while(true) {
	    		sco = scoville[0]+scoville[1]*2;
	    		answer++;
	    		if(sco > K || sco == K) break;
	    		else {
	    			scoville[0] = 1000000001;
	    			scoville[1] = sco;
	    			Arrays.sort(scoville);
	    		}
	    	}
	        return answer;
	    }
	}
}
