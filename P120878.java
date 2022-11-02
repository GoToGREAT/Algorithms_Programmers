public class P120878 {
	class Solution {
	    public int solution(int a, int b) {
	        
	    	int min = a > b ? b : a;
	    	
	    	int son = a;	    	
	    	int mother = b;
	    	
	    	for(int i=min; i>1; i--) {
	    		if(a%i ==0 && b%i==0) {
	    			son = a/i;
	    			mother = b/i;
	    			break;
	    		}
	    	}
	    	
	    	if(mother%2 == 0 || mother%5 == 0) {
	    		while(mother%2 == 0 || mother%5 == 0) {
	    			if(mother%2==0) {
	    				mother = mother/2;
	    			}
	    			if(mother%5==0) {
	    				mother = mother/5;
	    			}
	    		}
	    	}
	        
	        if(mother==1) return 1;        
	        
	        return 2;
	    }
	}
}