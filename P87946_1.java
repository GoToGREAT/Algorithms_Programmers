import java.util.*;

public class P87946_1 {
	class Solution {
		int possible=0;
	    public int solution(int k, int[][] dungeons) {
	        boolean[] check = new boolean[dungeons.length];
	        	
	        return check(k, dungeons, check, 0);
	    }
	    
	    int check(int k, int[][] dungeons, boolean[] check, int count) {
	    	for(int i=0; i<dungeons.length; i++) {
	    		if(k>=dungeons[i][0] && check[i]==false) {
	    			check[i]=true;
	    			check(k-dungeons[i][1], dungeons, check, count+1);
	    			check[i]=false;
	    		}
	    	}
	    	possible = Math.max(possible, count);
	    	return possible;
	    }
	}
}