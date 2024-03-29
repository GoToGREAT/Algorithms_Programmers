import java.util.*;

/*
정확성: 51.1
효율성: 7.5
합계: 58.6 / 100.0

거리 값 계산 시작
 */

public class P1844_1 {
	class Solution {
	    public int solution(int[][] maps) {
	    	int max_x = maps.length;
	    	int max_y = maps[0].length;
	    	
	    	Integer[][] cost = new Integer[max_x][max_y];
	    	cost[0][0]=1;
	    	Stack<Integer[]> stack = new Stack<>();
	    	Integer[] a = {0,0}; 
	    	stack.add(a);
	    	
	    	int start_x = 0;
	    	int start_y = 0;
	    	
	    	int cnt = 2;
	    	
	    	while(true) {
	    		if(start_y-1>0 && maps[start_x][start_y-1]==1
	    				&& cost[start_x][start_y-1]==null) {
	    			Integer[] b = {start_x,start_y-1};
	    			cost[start_x][start_y-1]=cnt;
	    	    	stack.add(b);
	    		} 
	    		
	    		if(start_x-1>0 && maps[start_x-1][start_y]==1
	    				&& cost[start_x-1][start_y]==null) {
	    			Integer[] b = {start_x-1,start_y};
	    			cost[start_x-1][start_y]=cnt;
	    	    	stack.add(b);
	    		}
	    		
	    		if(start_y+1<max_y && maps[start_x][start_y+1]==1
	    				&& cost[start_x][start_y+1]==null) {
	    			Integer[] b = {start_x,start_y+1};
	    			cost[start_x][start_y+1]=cnt;
	    	    	stack.add(b);
	    		}
	    		
	    		if(start_x+1<max_x && maps[start_x+1][start_y]==1
	    				&& cost[start_x+1][start_y]==null) {
	    			Integer[] b = {start_x+1,start_y};
	    			cost[start_x+1][start_y]=cnt;
	    	    	stack.add(b);
	    		}
	    		
	    		if(stack.empty()) {
	    			return -1;
	    		} else {
	    			Integer[] c =stack.pop();
	    			start_x = c[0];
	    	    	start_y = c[1];
	    	    	cnt = cost[c[0]][c[1]]+1;
	    		}
	    		
	    		if(cost[max_x-1][max_y-1]!=null) {
	    			return cost[max_x-1][max_y-1];
	    		}
	    	}
	    }
	}
}
