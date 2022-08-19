import java.util.*;

public class P118667_Test {
	public static void main(String[] args) {
	    	
	    	int[] queue1 = {1,1}; //6
	    	int[] queue2 = {1,5}; // 14
	    	
	    	
	    	long sum1 = 0;
	    	List<Integer> list1 = new LinkedList<>();
	    	for(int i=0; i<queue1.length; i++) {
	    		sum1 += (long) queue1[i];
	    		list1.add(queue1[i]);
	    	}
	    	
	    	long sum2 = 0;
	    	List<Integer> list2 = new LinkedList<>();
	    	for(int i=0; i<queue2.length; i++) {
	    		sum2 += (long) queue2[i];
	    		list2.add(queue2[i]);
	    	}
	    	System.out.println(" 최초합 "+sum1+" / "+sum2);	    		
	    	
	    	int answer = 0;
	    	
	    	while(true) {	  
	    		if((list1.isEmpty() || list2.isEmpty()) && sum1 != sum2) System.out.println("끝 : "+-1);
	    		
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
	    		System.out.println(answer+" : "+sum1+" / "+sum2);	    		
	    		
	    		if(sum1 == sum2) {
	    			break;
	    		}
	    	}
	    	System.out.println("끝 : "+ answer);
	
	}
}
