import java.util.*;

/*
채점 결과
정확성: 62.4
효율성: 30.1
합계: 92.5 / 100.0

현재 거리와 다음 거리 비교 스택 만듬.
 */

public class P1844_3 {
	class Solution {
	    public int solution(int[][] maps) {
	    	int max_x = maps.length;
	    	int max_y = maps[0].length;
	    	
	    	Integer[][] cost = new Integer[max_x][max_y];
	    	cost[0][0]=1;
	    	Stack<Integer[]> now_stack = new Stack<>();
	    	Stack<Integer[]> next_stack = new Stack<>();
	    	Integer[] a = {0,0}; 
	    	now_stack.add(a);
	    	
	    	int start_x = 0;
	    	int start_y = 0;
	    	
	    	int cnt = 2;
	    	
	    	while(true) {
	    		if(start_y-1>0 && maps[start_x][start_y-1]==1
	    				&& (cost[start_x][start_y-1]==null ||cost[start_x][start_y-1]>cnt)) {
	    			Integer[] b = {start_x,start_y-1};
	    			cost[start_x][start_y-1]=cnt;
	    			next_stack.add(b);
	    		} 
	    		
	    		if(start_x-1>0 && maps[start_x-1][start_y]==1
	    				&& (cost[start_x-1][start_y]==null || cost[start_x-1][start_y]>cnt)) {
	    			Integer[] b = {start_x-1,start_y};
	    			cost[start_x-1][start_y]=cnt;
	    			next_stack.add(b);
	    		}
	    		
	    			    		
	    		if(start_x+1<max_x && maps[start_x+1][start_y]==1
	    				&& (cost[start_x+1][start_y]==null || cost[start_x+1][start_y]>cnt)) {
	    			Integer[] b = {start_x+1,start_y};
	    			cost[start_x+1][start_y]=cnt;
	    			next_stack.add(b);
	    		}
	    		
	    		if(start_y+1<max_y && maps[start_x][start_y+1]==1
	    				&& (cost[start_x][start_y+1]==null || cost[start_x][start_y+1]>cnt)) {
	    			Integer[] b = {start_x,start_y+1};
	    			cost[start_x][start_y+1]=cnt;
	    			next_stack.add(b);
	    		}
	    		
	    		if(!now_stack.isEmpty()) {
	    			Integer[] c = now_stack.pop();
	    			start_x = c[0];
	    	    	start_y = c[1];
	    	    	cnt = cost[c[0]][c[1]]+1;	
	    		} else {
	    			if(!next_stack.isEmpty()) {
	    				now_stack = next_stack;
	    				next_stack = new Stack<>();
	    			} else return -1;
	    		}
	    		if(cost[max_x-1][max_y-1]!=null) {
	    			return cost[max_x-1][max_y-1];
	    		}
	    	}
	    }
	}
}
