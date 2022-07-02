import java.util.*;

/*
20문제 중 4문제 시간 초과
합계: 73.3 / 100.0
*/
public class P64065_1 {	
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
	    	Integer[] cut_int = new Integer[cut_s.length];
	    	
	    	for(int i=0; i<cut_int.length; i++){
	    		cut_int[i] = Integer.parseInt(cut_s[i]);
	    	}
	    	
	    	Set<Integer> num_set = new HashSet<Integer>(Arrays.asList(cut_int));
	    	// 중복 값이 제거된 숫자만 남음.
	    	
	    	Iterator<Integer> iter = num_set.iterator();	    	
	    	HashMap<Integer, Integer> map = new HashMap<>();
	    	for(int i=0; i<num_set.size(); i++) {
	    		map.put(iter.next(), 0);
	    	}
	    	
	    	for(int i=0; i<cut_int.length; i++){
	    		int a = map.get(cut_int[i]);// 숫자
	    		a++;
	    		map.replace(cut_int[i], a);
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