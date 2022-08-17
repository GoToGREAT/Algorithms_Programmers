import java.util.*;

public class P12952_2_Test {
	public static void main(String[] args) {
			int n = 4;
	    	List<String> possible = new ArrayList<>();
	    	List<String> answer = new ArrayList<>();
	    	for(int i=1; i<n+1; i++) {
	    		possible.add(Integer.toString(i));
	    		answer.add(Integer.toString(i));
	    	}
	    	int cnt = 1;
	    	while(true) {
	    		cnt++;
	    		List<String> now_check = answer;
	    		answer = new ArrayList<>();	    		
	    		
	    		for(int i=0; i<now_check.size(); i++) {
	    			List<String> now_possible = new ArrayList<>();
	    			now_possible.addAll(possible);
	    			String now = now_check.get(i);
	    			int a = now.charAt(now.length()-1)-48;
	    			for(int q=now_possible.size()-1; q>=0; q--) {
	    				System.out.println("a : "+a+ " / now_possible.get(q): "+now_possible.get(q));
	    				if(now.contains(now_possible.get(q)) || Math.abs(a-Integer.parseInt(now_possible.get(q)))<=1){
	    					System.out.println("삭제되고 있습니다.");
	    					now_possible.remove(q);
	    				}
	    			}
	    			
	    			for(int q=0; q<now_possible.size(); q++) {
	    				answer.add(now+now_possible.get(q));
	    				System.out.println("answer_add : "+now+now_possible.get(q));
	    			}
	    		}
	    		if(cnt==n) break;
	    	}
	    	
	    System.out.println(answer.size());
	}
}