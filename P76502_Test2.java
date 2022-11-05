/*

*/
public class P76502_Test2 {
	public static void main(String[] args) {
			String s = "}]()[{";
		
			int answer = 0;
	    	
	    	if(s.length()%2 != 0) System.out.println("홀수로 인해 0임");
	    	else {
	    		String now = s.substring(0);
	    		
	    		for(int i=0; i<s.length(); i++) {
	    			System.out.println(now);
	    			
	    			String that = now.substring(0);
	    			
	    			int n = 0;
	    			
	    			while(n<3) {	    				
	    				that = that.replaceAll("\\(\\)", "");
	    				that = that.replaceAll("\\[\\]", "");
	    				that = that.replaceAll("\\{\\}", "");
	    				n++;
	    			}
	    			
	    			
	    			if(that.replaceAll("", "").length()==0) answer++;
	    			
	    			System.out.println("that : "+that);
	    			System.out.println();
	    			now = now.substring(1) + now.charAt(0);
	    		}    		    	
	    		
	    	}
		    	System.out.println("끝 : "+answer);	    		
	    	
	}
}
