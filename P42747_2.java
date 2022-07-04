import java.util.*;

// 테스트 11제외 모두 통과 : 합계: 93.8 / 100.0
public class P42747_2 {
	class Solution {
	    public int solution(int[] citations) {
	    	// n번 이상 인용된 논문이 n개 이상이다.
	    	
	    	Arrays.sort(citations);
	    	
	    	int max = citations[citations.length-1];
	    	
	    	int[] count = new int[max+1];
	    	
	    	for(int i=max; i>-1; i--) {
	    		int cnt = 0;
	    		for(int q=citations.length-1; q>-1; q--) {
	    			if(citations[q]>=i) cnt++;
	    		}
	    		count[i]=cnt;
	    	}
	    	
	    	for(int i=max; i>-1; i--) {
	    		if(i==count[i]) return i;
	    	}
	    	
	    	
	    	return 0;
	    }
	}
}
