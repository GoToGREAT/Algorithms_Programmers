/*
마지막 안 풀리던 2문제만 통과
10,11번
*/

public class P77885_1_Test {
	public static void main(String[] args) {
		long[] numbers = {23,25,27,29,31,33,35,37,39,41,43};
	    	long[] answer = new long[numbers.length];	    	
	    	for(int i=0; i<numbers.length; i++) {
	    		long now = numbers[i];
	    		System.out.println("now : "+now);
	    		if(now%2==0) {
	    			long next = now+1;
	    			answer[i] = next;	
	    		} else {
	    			String now_string = Long.toBinaryString(now);
	    			System.out.println("now_string : "+now_string);
	    			if(now_string.replaceAll("1","").length()==0) {
	    				now_string = now_string.replaceFirst("1", "10");
	    			} else {
	    				int a = 0;
	    				String check_string = now_string;	    				    				
	    					int find = -1;
	    					boolean b1 = false;
	    					
	    					for(int q=check_string.length()-1; q>0; q--) {
	    						if(check_string.charAt(q-1)==48 && check_string.charAt(q)==49) {
	    							find = q-1;
	    							b1=true;
	    							break;
	    						}
	    						
	    						if(check_string.charAt(q-1)==49 && check_string.charAt(q)==48) {
	    							find = q-1;
	    							break;
	    						}
	    					}
	    					if(b1) {
	    						String first = now_string.substring(0, find);
	    						String last = now_string.substring(find, now_string.length());
	    						
	    						last = last.replaceAll("01", "10");
	    						now_string = first+last;	    						
	    					} else {
	    						String first = now_string.substring(0, find);
		    					String last = now_string.substring(find, now_string.length());
		    					
		    					last = last.replaceAll("10", "11");
		    					now_string = first+last;
	    					}
	    			}
	    			System.out.println("now_string : "+now_string);
	    			long number = Long.parseLong(now_string, 2);
    				answer[i] = number;	
    				System.out.println("number : "+number);
	    		}
	    	}    	
	      
	}
}