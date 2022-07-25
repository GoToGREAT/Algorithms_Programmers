public class P17687_Test {
		public static void main(String[] args) {
			int n=16;
			int t=16;
			int m=2;
			int p=1;
	
	        String total = "";
	        
	        int start = 0;
	        
	        while(total.length() <= t*m){
	        	total += Integer.toString(start++, n);
	        	System.out.println(start+"번 째 : "+total);
	        }
	        
	    	String answer = "";
	    	
	    	int now = p-1;
	    	while(answer.length()<t) {
	    		answer += total.charAt(now);
	    		now += m;
	    	}	   	
	        System.out.println(answer.toUpperCase());
	    
	}
}