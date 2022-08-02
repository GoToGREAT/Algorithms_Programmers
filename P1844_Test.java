import java.util.Stack;

public class P1844_Test {
	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
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
    		if(start_y-1>=0 && maps[start_x][start_y-1]==1
    				&& (cost[start_x][start_y-1]==null)) {
    			Integer[] b = {start_x,start_y-1};
    			cost[start_x][start_y-1]=cnt;
    			next_stack.add(b);
    		} 
    		
    		if(start_x-1>=0 && maps[start_x-1][start_y]==1
    				&& (cost[start_x-1][start_y]==null)) {
    			Integer[] b = {start_x-1,start_y};
    			cost[start_x-1][start_y]=cnt;
    			next_stack.add(b);
    		}
    		
    			    		
    		if(start_x+1<max_x && maps[start_x+1][start_y]==1
    				&& (cost[start_x+1][start_y]==null)) {
    			Integer[] b = {start_x+1,start_y};
    			cost[start_x+1][start_y]=cnt;
    			next_stack.add(b);
    		}
    		
    		if(start_y+1<max_y && maps[start_x][start_y+1]==1
    				&& (cost[start_x][start_y+1]==null)) {
    			Integer[] b = {start_x,start_y+1};
    			cost[start_x][start_y+1]=cnt;
    			next_stack.add(b);
    		}
    		
    		if(cost[max_x-1][max_y-1]!=null) {
    			System.out.println("성공 : "+cost[max_x-1][max_y-1]);
    			break;
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
    			} else if(cost[max_x-1][max_y-1]==null) {
    				System.out.println("실패");
    				break;
    			}
    		}	    
    	}
    	
    	for(int i=0; i<max_x; i++) {
    		for(int q=0; q<max_y; q++) {
    			System.out.print(cost[i][q]+" ");
    		}
    		System.out.println();
    	}
    	
    }
}
