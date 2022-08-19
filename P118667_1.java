import java.util.*;
import java.util.stream.Collectors;

/*
 채점 결과
정확성: 90.0
합계: 90.0 / 100.0

for문이 더 빠르다는 것을 알 수 있음.
 */

public class P118667_1 {
	class Solution {
	    public int solution(int[] queue1, int[] queue2) {
	    	long sum1 = Arrays.stream(queue1).sum();
	    	List<Integer> list1 = Arrays.stream(queue1).boxed().collect(Collectors.toList());
	    	
	    	long sum2 = Arrays.stream(queue2).sum();
	    	List<Integer> list2 = Arrays.stream(queue2).boxed().collect(Collectors.toList());
	    	
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
