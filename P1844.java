import java.util.*;

/*
채점 결과
정확성: 39.8
효율성: 7.5
합계: 47.4 / 100.0
*/

public class P1844 {
	class Solution {
	    public int solution(int[][] maps) {
	    	int max_x = maps.length;
	    	int max_y = maps[0].length;
	    	
	    	boolean[][] boo = new boolean[max_x][max_y];
	    	
	    	Stack<Integer[]> stack = new Stack<>();
	    	Integer[] a = {0,0}; 
	    	stack.add(a);
	    	boo[0][0]=true;
	    	
	    	int start_x = 0;
	    	int start_y = 0;
	    	while(true) {
	    		if(start_x+1<max_x && maps[start_x+1][start_y]==1
	    				&& boo[start_x+1][start_y]==false) {
	    			Integer[] b = {start_x+1,start_y};
	    			boo[start_x+1][start_y]=true;
	    	    	stack.add(b);
	    	    	start_x++;
	    		} else if(start_y+1<max_y && maps[start_x][start_y+1]==1
	    				&& boo[start_x][start_y+1]==false) {
	    			Integer[] b = {start_x,start_y+1};
	    			boo[start_x][start_y+1]=true;
	    	    	stack.add(b);
	    	    	start_y++;
	    		} else if(start_x-1>0 && maps[start_x-1][start_y]==1
	    				&& boo[start_x-1][start_y]==false) {
	    			Integer[] b = {start_x-1,start_y};
	    			boo[start_x-1][start_y]=true;
	    	    	stack.add(b);
	    	    	start_x--;
	    		} else if(start_y-1>0 && maps[start_x][start_y-1]==1
	    				&& boo[start_x][start_y-1]==false) {
	    			Integer[] b = {start_x,start_y-1};
	    			boo[start_x][start_y-1]=true;
	    	    	stack.add(b);
	    	    	start_y--;
	    		} else if(stack.empty()) {
	    			return -1;
	    		} else {
	    			Integer[] c =stack.pop();
	    			start_x = c[0];
	    	    	start_y = c[1];
	    		}
	    		if(start_x==max_x-1 && start_y==max_y-1) break;
	    	}
	        return stack.size();
	    }
	}
}
