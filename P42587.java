import java.util.*;

public class P42587 {
	class Solution {
	    public int solution(int[] priorities, int location) {
	    	wait_print printer = new wait_print();
	    	
	    	for(int i=0; i<priorities.length; i++) {
	    		printer.add(i, priorities[i]);
	    	}
	    	
	    	int cnt=0;
	    	int last = priorities.length-1;
	    	
	    	while(!printer.isEmpty()) {
	    		Arrays.sort(priorities);
	    		
	    		int now_order = priorities[last];
	    		
	    		wait_print.print a = printer.print_out();
	    		
	    		if(a.important==now_order) {
	    			if(a.name==location) return cnt+1;
	    			else {
	    				cnt++;
	    				priorities[last] = 0;
	    			}
	    		} else {
	    			printer.add(a.name, a.important);
	    		}
	    	}
	    	
	    	return 0;
	    }
	    
	    class wait_print{
	    	class print{
	    		private int name;
	    		private int important;
	    		
	    		private print next;
	    		
	    		public print(int name, int important) {
	    			this.name = name;
	    			this.important = important;
	    		}
	    	}
	    	
	    	private print first;
	    	private print last;
	    	
	    	private void add(int name, int important) {
	    		print a = new print(name, important);
	    		
	    		if(last != null) {
	    			last.next = a; 
	    		}
	    		last = a;
	    		if(first == null) {
	    			first = last;
	    		}
	    	}
	    	
	    	public print print_out() {
	    		if(first == null) {
	    			throw new NoSuchElementException();
	    		}
	    		print a = first;
	    		first = first.next;
	    		
	    		if(first ==null) {
	    			last = null;
	    		}
	    		return a;
	    	}	
	    	
	    	public boolean isEmpty() {
	    		return first == null;
	    	}
	     }	
	}
}