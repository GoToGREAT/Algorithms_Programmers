import java.util.*;

/*
채점 결과
정확성: 100.0
합계: 100.0 / 100.0
 */

public class P12978_1 {
	class Solution {
	    public int solution(int N, int[][] road, int K) {
	    	int[][] count_road = new int[N+1][N+1];
	    	
	    	for(int i=0; i<road.length; i++) {
	    		int start = road[i][0];
	    		int end = road[i][1];
	    		int cost = road[i][2];
	    		
	    		if(count_road[start][end]==0 || count_road[start][end]>cost) {
	    			count_road[start][end] = cost;
	    			count_road[end][start] = cost;	    			
	    		} 
	    	}
 	    	
	    	int[] final_cost = new int[N+1];
	    	final_cost[0] = 1000000;
	    	Stack<Integer> stack = new Stack<>();
	    	
	    	int start = 1;
	    	for(int q=2; q<N+1; q++) {
	    		if(count_road[start][q]!=0) {
	    			if(final_cost[q]==0 || final_cost[q] > count_road[start][q]) {
	    					final_cost[q]=count_road[start][q];
	    					stack.add(q);
	    			}
	    		}
	    	}   	
	    		
	    	while(true){
	    		start = stack.pop();
	    		if(start==1) {
                    if(stack.isEmpty()) break;
                    continue;
                }
	    		else {
	    			for(int q=2; q<N+1; q++) {
	    	    		if(count_road[start][q]!=0) {
	    	    			if(final_cost[q]==0 || final_cost[q] > final_cost[start]+count_road[start][q]) {
	    	    					final_cost[q]=final_cost[start]+count_road[start][q];
	    	    					stack.add(q);
	    	    			}
	    	    		}
	    	    	} 
	    		}
	    		if(stack.isEmpty()) break;
	    	}
	    	int answer = 0;
	    	for(int i=1; i<N+1; i++) {
	    		if(final_cost[i]<=K) answer++;
	    	}
	    	
	        return answer;
	    }
	}
}