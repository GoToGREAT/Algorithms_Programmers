

public class P77885_Test {
	public static void main(String[] args) {
		long[] numbers = {2,7};
		long[] answer = new long[numbers.length];
    	
		for(int i=0; i<numbers.length; i++) {
    		long now = numbers[i];    		
    		if(now%4==3) {
    			long next;
    			String s_next = Long.toBinaryString(now);
    			System.out.println("s_next : "+s_next);
    			if(s_next.replace("1", "").length()==0) {
    				s_next=s_next.replaceFirst("1", "10");
    				System.out.println("new s_next : "+s_next);
    			} else {
    				s_next=s_next.replaceFirst("01", "10");
    				System.out.println("new s_next : "+s_next);
    			}
    			next = Long.parseLong(s_next);
    			answer[i] = next;	
    			System.out.println("next : "+next);
    		} else {
    			long next = now+1;
    			while(true) {
    				long q= now^next;
    				String bi_q = Long.toBinaryString(q);
    				int cnt = bi_q.length()-bi_q.replace("1", "").length();
    				if(cnt==1 || cnt==2) break;
    				else next++;
    			}	    			
    			answer[i] = next;	
    			System.out.println("next : "+next);
    		}
    	}	    	
      
	}
}