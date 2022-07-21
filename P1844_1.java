import java.util.*;

public class P1844_1 {
	class Solution {
	    public int solution(int[][] maps) {
	    	int max_x = maps.length;
	    	int max_y = maps[0].length;
	    	
	    	boolean[][] boo = new boolean[max_x][max_y];
	    	int int_boo = max_x*max_y;
	    	for(int i=0; i<max_x; i++) {
	    		for(int k=0; k<max_y; k++) {
	    			if(maps[i][k]==0) {
	    				boo[i][k]=true;
	    				int_boo--;
	    			}
	    		}
	    	}
	    	
	    	int[][] cost = new int[max_x][max_y];
	    	cost[max_x-1][max_y-1] = -1;
	    
	    	Stack<Integer[]> now_stack = new Stack<>();
	    	Stack<Integer[]> next_stack = new Stack<>();
	    	
	    	boo[0][0]=true;
	    	
	    	int start_x = 0;
	    	int start_y = 0;
	    	
	    	int now_cost=1;
	    	
	    	while(true) {
	    		if(start_x+1<max_x && boo[start_x+1][start_y]==false) {
	    			Integer[] b = {start_x+1,start_y};
	    			boo[start_x+1][start_y]=true;
	    			int_boo--;
	    			cost[start_x+1][start_y] = now_cost;
	    			next_stack.add(b);
	    		}
	    		if(start_y+1<max_y && boo[start_x][start_y+1]==false) {
	    			Integer[] b = {start_x,start_y+1};
	    			boo[start_x][start_y+1]=true;
	    			int_boo--;
	    			cost[start_x][start_y+1] = now_cost;
	    			next_stack.add(b);
	    		}
	    		if(start_x-1>0 && boo[start_x-1][start_y]==false) {
	    			Integer[] b = {start_x-1,start_y};
	    			boo[start_x-1][start_y]=true;
	    			int_boo--;
	    			cost[start_x-1][start_y] = now_cost;
	    			next_stack.add(b);
	    		}
	    		if(start_y-1>0 && boo[start_x][start_y-1]==false) {
	    			Integer[] b = {start_x,start_y-1};
	    			boo[start_x][start_y-1]=true;
	    			int_boo--;
	    			cost[start_x][start_y-1] = now_cost;
	    			next_stack.add(b);
	    		} 
	    		if(int_boo==0) break;
	    		if(now_stack.empty()) {
	    			now_stack = next_stack;
	    			next_stack = new Stack<>();
	    			now_cost++;
	    		} else {
	    			Integer[] c = now_stack.pop();
	    			start_x = c[0];
	    	    	start_y = c[1];
	    		}
	    	}	    		    	
	        return cost[max_x-1][max_y-1];
	    }
	}
}
