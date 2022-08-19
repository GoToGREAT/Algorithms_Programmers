import java.util.*;

/*
채점 결과
정확성: 93.3
합계: 93.3 / 100.0

시간초과 2문제
 */
public class P118667 {
	class Solution {
	    public int solution(int[] queue1, int[] queue2) {
	    	long sum1 = 0;
	    	List<Integer> list1 = new LinkedList<>();
	    	for(int i=0; i<queue1.length; i++) {
	    		sum1 += queue1[i];
	    		list1.add(queue1[i]);
	    	}
	    	
	    	long sum2 = 0;
	    	List<Integer> list2 = new LinkedList<>();
	    	for(int i=0; i<queue2.length; i++) {
	    		sum2 += queue2[i];
	    		list2.add(queue2[i]);
	    	}
	    	
	    	int answer = 0;
	    	
	    	while(true) {	    		
	    		if(sum1 == sum2) {
	    			break;
	    		}	    		
	    		answer++;
	    		if(sum1>sum2) {
	    			int now = list1.get(0);
	    			
	    			list1.remove(0);
	    			sum1 -= now;
	    			
	    			list2.add(now);
	    			sum2 += now;
	    		}  else {
	    			int now = list2.get(0);
	    			
	    			list2.remove(0);
	    			sum2 -= now;
	    			
	    			list1.add(now);
	    			sum1 += now;
	    		}
                
	    		if((list1.isEmpty() || list2.isEmpty()) && sum1 != sum2) return -1;
	    	}
	        return answer;
	    }
	}
}
