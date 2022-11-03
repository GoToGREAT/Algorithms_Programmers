import java.util.*;

public class P120880_Test {
	public static void main(String[] args) {
		   int[] numlist = {10000, 20, 36, 47, 40, 6, 10, 7000};
		   int n = 30;
	        int[] answer = new int[numlist.length];  
	        	        
	        List<Integer> under = new ArrayList<>();
	        List<Integer> over = new ArrayList<>();
	        
	        for(int i=0; i<numlist.length; i++) {
	        	if(numlist[i] >= n) {
	        		over.add(numlist[i]);
	        	} else under.add(0, numlist[i]);
	        }
	        
	        int now = 0;
	        
	        
	        for(int i=0; i<under.size(); i++) {
	        	System.out.println("under : "+under.get(i));
	        }
	        
	        for(int i=0; i<over.size(); i++) {
	        	System.out.println("over : "+over.get(i));
	        }
	        
	        
	        
	        while(under.size() > 0 || over.size() > 0) {
	        	
	        	if(under.size()==0) {
	        		answer[now++] = over.get(0);
	        		over.remove(0);
	        	} else if(over.size() == 0) {
	        		answer[now++] = under.get(0);
	        		under.remove(0);
	        	} else {
	        		if(Math.abs(under.get(0)-n) >  Math.abs(over.get(0)-n)) {
	        			answer[now++] = over.get(0);
		        		over.remove(0);
	        		} else {
	        			answer[now++] = under.get(0);
		        		under.remove(0);
	        		}
	        	} 	
	        	
	        }
	        
	    System.out.println("answer : "+answer);
	}
}