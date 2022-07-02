import java.util.*;

public class P92341 {
	class Solution {
	    public int[] solution(int n, int[] info) {
	    	int apeach = 0;
	    	
	    	archery_target[] at = new archery_target[10];
	    	
	    	for(int i=0; i<10; i++) {
	    		int name = 10-i;
	    		int cost = info[i]+1;
	    		at[i] = new archery_target(name, cost);
	    		
	    		if(info[i]>1) {
	    			apeach += name;
	    		} // 어피치 점수 계산
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	        int[] answer = {};
	        return answer;
	    }
	}
}

class archery_target{
	int name;
	int cost;
	boolean Apeach;
	
	archery_target(int name, int cost){
		this.name = name;
		this.cost = cost;
		Apeach = cost>2 ? false : true;
	}
}

