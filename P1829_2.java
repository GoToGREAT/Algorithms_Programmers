import java.util.*;

// 참조자료형은 주소값 전달해주는거 신기하다.
// 편리하다.
public class P1829_1 {
	class Solution {
	    public int[] solution(int m, int n, int[][] picture) {
	    	boolean[][] boo = new boolean[m][n];
	    	
	        int numberOfArea = 0;
	        int maxSizeOfOneArea = 0;
	        
	        while(true) {
	        	Integer[] check = find_start(boo, m, n);
	        	if(check==null) break;
	        	if(picture[check[0]][check[1]]==0) {
	        		find_area(check, boo, picture, m, n);
	        	} else {
	        		numberOfArea++;
	        		int now_max = find_area(check, boo, picture, m, n);
	        		maxSizeOfOneArea = maxSizeOfOneArea >= now_max ? maxSizeOfOneArea : now_max;
	        	}
	        }
	         int[] answer = new int[2];
	        answer[0] = numberOfArea;
	        answer[1] = maxSizeOfOneArea;
	        return answer;
	    }
	    
	    Integer[] find_start(boolean[][] boo, int m, int n) {
	    	for(int i=0; i<m; i++) {
	    		for(int q=0; q<n; q++) {
	    			if(boo[i][q]==false) {
	    				boo[i][q] = true;
	    				Integer[] answer = {i,q};	    				
	    				return answer;
	    			}
	    		}
	    	}
	    	return null;
	    }
	    
	    int find_area(Integer[] start, boolean[][] boo, int[][] picture, int m, int n) {
	    	int max = 1;
	    	Stack<Integer[]> stack = new Stack<>();
	    	stack.add(start);
	    	
	    	while(true) {
	    		if(stack.isEmpty()) break;
	    		Integer[] now = stack.pop();
	    		int x = now[0];
	    		int y = now[1];
	    		
	    		if(x+1<m && boo[x+1][y]==false &&
	    				picture[x+1][y] == picture[x][y]) {
	    			max++;
	    			boo[x+1][y] = true;
	    			Integer[] put = {x+1,y};
	    			stack.add(put);
	    		}
	    		if(y+1<n && boo[x][y+1]==false &&
	    				picture[x][y+1] == picture[x][y]) {
	    			max++;
	    			boo[x][y+1] = true;
	    			Integer[] put = {x,y+1};
	    			stack.add(put);
	    		}
	    		if(x-1>=0 && boo[x-1][y]==false &&
	    				picture[x-1][y] == picture[x][y]) {
	    			max++;
	    			boo[x-1][y] = true;
	    			Integer[] put = {x-1,y};
	    			stack.add(put);
	    		}
	    		if(y-1>=0 && boo[x][y-1]==false &&
	    				picture[x][y-1] == picture[x][y]) {
	    			max++;
	    			boo[x][y-1] = true;
	    			Integer[] put = {x,y-1};
	    			stack.add(put);
	    		}
	    	}
	    	return max;
	    }
	}
}