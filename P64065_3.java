import java.util.*;

// 전 방법보다 for문 2개를 줄였지만 효율성 통과 못함.
public class P64065_3 {	
	class Solution {
	    public int[] solution(String s) {
	    	String[] s_arr = s.split("");
	    	
	    	String new_s = "";
	    	for(int i=1; i<s_arr.length-1; i++) {
	    		if(s_arr[i].equals("{") || s_arr[i].equals("}")) continue;
	    		if(s_arr[i].equals(",")) {
	    			new_s += " ";
	    		} else new_s += s_arr[i];
	    	}	    	
  	
	    	String[] cut_s = new_s.split(" ");
	    	
	    	HashMap<Integer, Integer> map = new HashMap<>();
	    	for(int i=0; i<cut_s.length; i++) {
	    		int number = Integer.parseInt(cut_s[i]);
	    		if(map.containsKey(number)) {
	    			int cnt = map.get(number)+1;
	    			map.replace(number, cnt);
	    		} else {
	    			map.put(number,1);
	    		}
	    	}
	    	
	    	List<Integer> keySetList = new ArrayList<>(map.keySet());
	    	Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
	    	
	    	int[] answer = new int[map.size()];
	    	
	    	for(int i=0; i<answer.length; i++) {
	    		answer[i] = keySetList.get(i);
	    	}
	        return answer;
	    }   
	}
}