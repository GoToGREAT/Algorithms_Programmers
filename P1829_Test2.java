import java.util.*;

public class P1829_Test2 {
	public static void main(String[] args) {
	    	class FindAnswer{
	    		int x_max;
	    		int y_max;
	    		
	    		int boo;		
	    		boolean[][] arr_boo;
	    		
	    		Set<Integer> color;
	    		int max_area;
	    		
	    		
	    		FindAnswer(int[][] picture){
	    			this.x_max = picture.length;
	    			this.y_max = picture[0].length;
	    			arr_boo = new boolean[x_max][y_max];
	    			boo = x_max*y_max;
	    			
	    			color = new HashSet<>();
	    			max_area = 0;
	    		}
	    		
	    		int[] serch_false() {
	    			for(int i=0; i<x_max; i++) {
	    				for(int k=0; k<y_max; k++) {
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
	    			stack.add(now);
	    			
	    			int now_color = picture[start_x][start_y];
	    			color.add(now_color);
	    			
	    			int count_area=1;
	    			System.out.println("탐색 시작했습니다. : "+start_x+" / "+start_y);
	    			while(true) {
	    				System.out.println("탐색 중입니다. : "+start_x+" / "+start_y);
	    				if(start_x+1<x_max && picture[start_x+1][start_y]==now_color
	    						&&arr_boo[start_x+1][start_y]==false) {
	    					arr_boo[start_x+1][start_y]=true;
	    					boo--;
	    					Integer[] a = {start_x+1, start_y};
	    					stack.add(a);
	    					start_x++;
	    					count_area++;
	    				} else if(start_y+1<y_max && picture[start_x][start_y+1]==now_color
	    						 &&arr_boo[start_x][start_y+1]==false) {
	    					arr_boo[start_x][start_y+1]=true;
	    					boo--;
	    					Integer[] a = {start_x,start_y+1};
	    					stack.add(a);
	    					start_y++;
	    					count_area++;
	    				} else if(start_x-1>=0 && picture[start_x-1][start_y]==now_color
	    						&&arr_boo[start_x-1][start_y]==false) {
	    					arr_boo[start_x-1][start_y]=true;
	    					boo--;
	    					Integer[] a = {start_x-1,start_y};
	    					stack.add(a);
	    					start_x--;
	    					count_area++;
	    				} else if(start_y-1>=0 && picture[start_x][start_y-1]==now_color
	    						 && arr_boo[start_x][start_y-1]==false) {
	    					arr_boo[start_x][start_y-1]=true;
	    					boo--;
	    					Integer[] a = {start_x,start_y-1};
	    					stack.add(a);
	    					start_y--;
	    					count_area++;
	    				} else {
	    					System.out.println("스택 사이즈 : "+stack.size());
	    					if(stack.empty()) {
	    						if(now_color!=0) {
	    							System.out.println(now_color + " / "+ count_area);
	    	    					max_area = max_area>=count_area ? max_area : count_area;
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
	    	int[][] picture = {{1, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 1}};
	    	FindAnswer expedition = new FindAnswer(picture);
	    	
	    	while(expedition.boo!=0) {
	    		int[] now = expedition.serch_false();
	    		expedition.serch_group(picture, now);
	    	}
	    	
	    	

	        int[] answer = {expedition.color.size(), expedition.max_area};
	        System.out.println(answer[0]+" / "+answer[1]);
	  
	}
}
