
public class P42842_1_Test {
	public static void main(String[] args) {
	    int brown = 14;
	    int yellow = 4;
	    
	    int total = brown+yellow;
    	double total_sqrt = Math.sqrt(total);
    	
    	int l1 = (int)Math.floor(total_sqrt);
    	int l2 = 0;
    	
    	while(true) {
    		if(total%l1 == 0) {
    			l2 = total/l1;
    			if((l1-2)*(l2-2)==yellow) {
    				if(l1 >= l2) {
    					int[] answer = {l1, l2};
    					System.out.println(l1+" / "+l2);
    					 break;
    				} else {
    					int[] answer = {l2, l1};
    					System.out.println(l1+" / "+l2);
    					 break;
    				}    				
    			}  
    			 			
    		} 
    		l1++;
    	}
    	
    	
    
	}
 }
