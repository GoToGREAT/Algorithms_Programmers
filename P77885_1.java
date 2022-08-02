/*
모두 통과 : 무조건 프린트 찍어보기
*/

public class P77885_1 {
	class Solution {
	    public long[] solution(long[] numbers) {    	
	    	long[] answer = new long[numbers.length];	    	
	    	for(int i=0; i<numbers.length; i++) {
	    		long now = numbers[i];
	    		if(now%2==0) {
	    			long next = now+1;
	    			answer[i] = next;	
	    		} else {
	    			String now_string = Long.toBinaryString(now);
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
	    			long number = Long.parseLong(now_string, 2);
    				answer[i] = number;	
	    		}
	    	}    	
	      	    	
	        return answer;
	    }
	}
}