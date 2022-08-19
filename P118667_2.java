import java.util.*;
import java.util.stream.Collectors;

public class P118667_2 {
	class Solution {
	    public int solution(int[] queue1, int[] queue2) {
	    	int max1 = queue1.length;
	    	int max2 = queue2.length;
	    	int max = max1 >= max2 ? max1 : max2;
	    	
	    	long sum1 = 0;
	    	List<Integer> list1 = new LinkedList<>();
	    	long sum2 = 0;
	    	List<Integer> list2 = new LinkedList<>();
	    	for(int i=0; i<max; i++) {
	    		if(i<max1) {
	    			sum1 += queue1[i];
	    			list1.add(queue1[i]);    			
	    		}
	    		if(i<max2) {
	    			sum2 += queue2[i];
		    		list2.add(queue2[i]);	
	    		}    		
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
	    	
	    	// 무한하게 돌아가는 경우를 없애기 위해
	    	// 1 ≤ queue1의 길이 = queue2의 길이 ≤ 300,000
	    	// 600000이 넘으면 불가능을 리턴
	    	if(answer >=600000) return -1;
	    	}
	        return answer;
	    }
	}
}
