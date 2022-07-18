import java.util.*;

/*
배열이 있다.

배열의 하나하나를 더하거나 뺀다

첫 번째가 끝나면 2개의 결과
두 번째가 끝나면 4개의 결과
세 번째가 끝나면 8개의 결과가 있다.

이전 결과에다가 다음 숫자를 더하거나 뺀다

셋을 배열에다가 넣을 수 있을까?

맵에는 배열을 넣을 수 있다.

*/


public class P43165 {
	class Solution {
	    public int solution(int[] numbers, int target) {
	        HashMap<Integer, List<Integer>> map = new HashMap<>();
	        
	        for(int i=0; i<numbers.length; i++) {
	        	if(i==0) {
	        		List<Integer> list = new ArrayList<>();
	        		list.add(-numbers[i]);
	        		list.add(numbers[i]);
	        		map.put(i, list);
	        	} else if(i==numbers.length-1) {
	        		List<Integer> list = map.get(i-1);
	        		List<Integer> return_list = check(list, numbers[i], target);
	        		return return_list.size();
	        	} 
	        	else {
	        		List<Integer> list = map.get(i-1);
	        		List<Integer> return_list = work(list, numbers[i]);
	        		map.put(i, return_list);
	        	}
	        }
	        return 0;
	    }
	    static List<Integer> work(List<Integer> list, int a){
	    	List<Integer> n_list = new ArrayList<>();
	    	for(int i=0; i<list.size(); i++) {
	    		n_list.add(list.get(i)+a);
	    		n_list.add(list.get(i)-a);
	    	}
	    	return n_list;
	    }
	    
	    static List<Integer> check(List<Integer> list, int a, int target){
	    	List<Integer> n_list = new ArrayList<>();
	    	for(int i=0; i<list.size(); i++) {
	    		if(list.get(i)+a == target) n_list.add(list.get(i)+a);
	    		if(list.get(i)-a == target) n_list.add(list.get(i)-a);
	    	}
	    	return n_list;
	    }
	}
	
}