import java.util.*;

public class P132265 {
	class Solution {
	    public int solution(int[] topping) {	    	
	        int answer = 0;
	        
	        HashMap<Integer, Integer> a = new HashMap<>();
	        HashMap<Integer, Integer> b = new HashMap<>();
	        
	        for(int i=0; i<topping.length; i++) {
	        	put(b, topping[i]);
	        }
	        
	        for(int i=0; i<topping.length; i++) {
	        	put(a, topping[i]);
	        	
	        	del(b, topping[i]);
	        	
	        	if(a.keySet().size() == b.keySet().size()) answer++;
	        }
	        
	        return answer;
	    }
	    
	    void put(HashMap<Integer, Integer> map, int put) {
	    	if(map.containsKey(put)) {
	    		map.replace(put, map.get(put)+1);
	    	} else map.put(put, 1);
	    }
	    void del(HashMap<Integer, Integer> map, int del) {
	    	if(map.get(del)==1) {
	    		map.remove(del);
	    	} else {
	    		map.replace(del, map.get(del)-1);
	    	}
	    }
	}
}