import java.util.*;

// 키 값 변환을 직접 하였더니 더 오랜 시간이 걸림
public class P64065_4 {	
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
	    			map.replace(number, map.get(number)+1);
	    		} else {
	    			map.put(number,1);
	    		}
	    	}
	    	int map_size = map.size();
	    	int[] answer = new int[map_size];
	    	
	    	List<Integer> keySetList = new ArrayList<>(map.keySet());
	    	
	    	int count=1;
	    	// map의 value 값은 1부터 있을 것이다.
	    	while(true) {
	    		int cnt=0;
	    		while(true) {
	    			int find = keySetList.get(cnt);
	    			if(map.get(find)==count) {
	    				answer[map_size-1]=find;
	    				keySetList.remove(cnt);
	    				map_size--;
	    				count++;
	    				break;
	    			}	    			
	    		}
	    		cnt=0;
	    		if(map_size==0) break;
	    	}
	        return answer;
	    }   
	}
}