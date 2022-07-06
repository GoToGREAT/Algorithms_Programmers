import java.util.*;

public class P42578 {
	class Solution {
	    public int solution(String[][] clothes) {
	    	int answer = 1;
	    	
	    	HashMap<String, List<String>> Closet = new HashMap<>();
	    	
	    	for(int i=0; i<clothes.length; i++) {
	    		String division = clothes[i][1];
	    		String name = clothes[i][0];
	    		
	    		if(Closet.containsKey(division)) {
	    			List<String> a = Closet.get(division);
	    			a.add(name);
	    			Closet.replace(division, a);
	    		} else {
	    			List<String> a = new ArrayList<>();
	    			a.add(name);
	    			Closet.put(division, a);
	    		}
	    	}
	    	
	    	Object[] key_count = Closet.keySet().toArray();
	    	
	    	if(key_count.length==1) return clothes.length;
	    	
	    	
	    		    	
	    	for(int i=0; i<key_count.length; i++) {
	    		answer *= Closet.get(key_count[i]).size()+1;
	    	}
	        return answer-1;
	    }
	}
}