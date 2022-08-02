

public class P77885_Test {
	public static void main(String[] args) {
		long[] numbers = {23,25,27,29,31,33,35,37,39,41,43};
		long[] answer = new long[numbers.length];
    	
		for(int i=0; i<numbers.length; i++) {
    		long now = numbers[i];
    		System.out.println(i+1+"번 째 : "+now+" / "+Long.toBinaryString(now));
    		long next = now+1;
    		while(true) {
    			   long q= now^next;
    			   String bi_q = Long.toBinaryString(q);
    			   int cnt = bi_q.length()-bi_q.replace("1", "").length();
    			   if(cnt==1 || cnt==2) break;
    			   else next++;
    		}
    		answer[i] = next;
    		System.out.println(i+1+"번 째 : "+next+" / "+Long.toBinaryString(next));
    	System.out.println();
		}	    	
      
	}
}