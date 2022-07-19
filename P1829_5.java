import java.util.*;

// 전역변수 선언 : 실패
public class P1829_5 {
	class Solution {		
		int boo;		
		boolean[][] arr_boo;
		
		int numberOfArea;
        int maxSizeOfOneArea;
        
        int m;
        int n;
	    public int[] solution(int m, int n, int[][] picture) {
	    	  int[][] copy = new int[picture.length][picture[0].length];
	          for(int i=0; i<copy.length; i++){
	              copy[i] = picture[i].clone();
	          }
	          
  			arr_boo = new boolean[m][n];
  			for(int i=0; i<m; i++) {
  				for(int k=0; k<n; k++) {
  					arr_boo[i][k]=false;
  				}
  			}
  			numberOfArea = 0;
  			maxSizeOfOneArea = 0;
  			
  			this.m=m;
  			this.n=n;
  			
  			boo = m*n;
  			    			
  			maxSizeOfOneArea = 0;
  			
	    	FindAnswer expedition = new FindAnswer();
	    	
	    	while(boo!=0) {
	    		int[] now = expedition.serch_false();
	    		expedition.serch_group(copy, now);
	    	}
	    	

	        int[] answer = {numberOfArea, maxSizeOfOneArea};
	        return answer;
	    }
    	class FindAnswer{
    		
    		
    		int[] serch_false() {
    			for(int i=0; i<m; i++) {
    				for(int k=0; k<n; k++) {
    					if(arr_boo[i][k]==false) {
    						int[] re = {i,k};
    						return re;
    					}
    				}
    			}
    			return null;
    		}
    		
    		void serch_group(int[][] picture, int[] start) {
    			Stack<Integer[]> stack = new Stack<>();
    			int start_x = start[0];
    			int start_y = start[1];
    			arr_boo[start_x][start_y]=true;
    			boo--;
    			Integer[] now = {start_x,start_y};
    			stack.push(now);
    			
    			int now_color = picture[start_x][start_y];
    			
    			int count_area=1;
    			if(now_color!=0) {numberOfArea++;}
    			while(true) {
    				if(start_x+1<m && picture[start_x+1][start_y]==now_color
    						&&arr_boo[start_x+1][start_y]==false) {
    					arr_boo[start_x+1][start_y]=true;
    					boo--;
    					Integer[] a = {start_x+1,start_y};
    					stack.push(a);
    					start_x++;
    					count_area++;
    				} else if(start_y+1<n && picture[start_x][start_y+1]==now_color
    						 &&arr_boo[start_x][start_y+1]==false) {
    					arr_boo[start_x][start_y+1]=true;
    					boo--;
    					Integer[] a = {start_x,start_y+1};
    					stack.push(a);
    					start_y++;
    					count_area++;
    				} else if(start_x-1>=0 && picture[start_x-1][start_y]==now_color
    						&&arr_boo[start_x-1][start_y]==false) {
    					arr_boo[start_x-1][start_y]=true;
    					boo--;
    					Integer[] a = {start_x-1,start_y};
    					stack.push(a);
    					start_x--;
    					count_area++;
    				} else if(start_y-1>=0 && picture[start_x][start_y-1]==now_color
    						 &&arr_boo[start_x][start_y-1]==false) {
    					arr_boo[start_x][start_y-1]=true;
    					boo--;
    					Integer[] a = {start_x,start_y-1};
    					stack.push(a);
    					start_y--;
    					count_area++;
    				} else {
    					if(stack.empty()) {
    					if(now_color!=0) {
    						maxSizeOfOneArea = maxSizeOfOneArea>=count_area ?
    								maxSizeOfOneArea : count_area;	    					
    					}
    					break;
    					}
    					Integer[] new_start = stack.pop();
    					start_x = new_start[0];
    					start_y = new_start[1];
    				}
    			}
    		}			
    	}
	}
}
