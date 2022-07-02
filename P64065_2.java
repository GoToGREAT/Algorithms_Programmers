import java.util.*;

// for문을 1개 줄였지만 효율성 문제 통과하지 못함.
public class P64065_2 {	
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
	    	
	    	Set<Integer> num_set = new HashSet<Integer>();
	    	// 중복 값이 제거된 숫자만 남음.
	    	
	    	for(int i=0; i<cut_s.length; i++){
	    		num_set.add(Integer.parseInt(cut_s[i]));
	    	}
	    	
	    	Iterator<Integer> iter = num_set.iterator();	    	
	    	HashMap<Integer, Integer> map = new HashMap<>();
	    	for(int i=0; i<num_set.size(); i++) {
	    		map.put(iter.next(), 0);
	    	}
	    	
	    	for(int i=0; i<cut_s.length; i++){
	    		int q= Integer.parseInt(cut_s[i]);
	    		int a = map.get(q);
	    		a++;
	    		map.replace(q, a);
	    	}
	    	
	    	List<Integer> keySetList = new ArrayList<>(map.keySet());
	    	Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
	    	
	    	int[] answer = new int[num_set.size()];
	    	for(int i=0; i<answer.length; i++) {
	    		answer[i] = keySetList.get(i);
	    	}
	        return answer;
	    }   
 }
}