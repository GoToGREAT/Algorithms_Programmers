public class P12946_Test {
	public static void main(String[] args) {
		int n = 3;
		hanoi(n, 1,3,2);
		
		
	}
	  static  void hanoi(int n, int start, int to, int via){	    	
	    	if(n==1) {
	    		move(1, start, to);
	    	} else {
	    		hanoi(n-1, start, via, to);
	    		move(n, start, to);
	    		hanoi(n-1, via, to, start);
	    	}
 	    }
	    
	  static  Integer[] move(int n, int start, int to) {
	    	Integer[] answer = {start, to};
	    	System.out.println("start : "+start+" / to : "+to);
	    	return answer;
	    }
	    
	
}