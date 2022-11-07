import java.util.*;


/*
예외 사항 모두 처리
 */

public class P120884_2 {
	class Solution {
	    public int solution(int chicken) {
	      int answer = 0;
	      
	      
	      List<Integer> share = new LinkedList<>();
	      share.add(chicken/10);
	      answer += chicken/10;
	      int rest = chicken%10;
	      
	      int cnt = 1;
	      
	      while(true) {
	    	  if(share.get(cnt-1)<10) break;
	    	  else {
	    		  share.add(share.get(cnt-1)/10);
	    		  answer += share.get(cnt-1)/10;
	    		  rest += share.get(cnt-1)%10;	    		  
	    	  }
	    	  cnt++;
	      }
	      
	      rest += share.get(share.size()-1);
	      
	      while(rest >= 10) {
	    	  if(rest >= 10) {	    	  
	    		  int count = 1;
	    		  List<Integer> restlist = new LinkedList<>();
	    		  restlist.add(rest);
	    		  rest = 0;
	    		  while(true) {
	    			  if(restlist.get(count-1)<10) break;
	    			  else {
	    				  restlist.add(restlist.get(count-1)/10);
	    				  answer += restlist.get(count-1)/10;
	    				  rest += restlist.get(count-1)%10;
	    				  count++;
	    			  }
	    		  }
	    		  rest += restlist.get(restlist.size()-1);
	    	  }   	    	  
	      }
	      
	      return answer;
	    }
	}
}
