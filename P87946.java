import java.util.*;

/*
채점 결과
정확성: 15.8
합계: 15.8 / 100.0
 */

public class P87946 {
	class Solution {
	    public int solution(int k, int[][] dungeons) {
	        int answer = 0;

	        List<Integer[]> d_list = new ArrayList<>();
	        
	        for(int i=0; i<dungeons.length; i++) {
	        	Integer[] put = new Integer[2];
	        	put[0] = dungeons[i][0];
	        	put[1] = dungeons[i][1];
	        	d_list.add(put);
	        }
	        
	        while(true) {
	        	int[] possible = check(k,d_list);
	        	if((possible[0]+possible[1])==0) break;
	        	else if(possible[1]==1) {
	        		k = find_now(k, d_list);
	        	} else {
	        		k = find_min(k, d_list, possible[2]);
	        	}
	        	answer++;
	        } 
	        return answer;
	    }
	    int[] check(int k, List<Integer[]> d_list) {	    	
	    	int num = 0;
	    	int now = 0;
	    	int min = 5000;
	    	for(int i=0; i<d_list.size(); i++) {
	    		if(min > d_list.get(i)[1]) min = d_list.get(i)[1];
	    		if(d_list.get(i)[0]>num) {
	    			num++;
	    		} else if(d_list.get(i)[0]==num) {
	    			now++;
	    		}
	    	}	    
	    	int[] arr = {num, now, min};
 	    	return arr;
	    }
	    
	    int find_now(int k, List<Integer[]> d_list) {
	    	for(int i=0; i<d_list.size(); i++) {
	    		if(d_list.get(i)[0]==k) {
	    			k -= d_list.get(i)[1];
	    			d_list.remove(i);
	    			return k;
	    		}
	    	}	
	    	return 0;
	    }
	    
	    int find_min(int k, List<Integer[]> d_list, int min) {
	    	for(int i=0; i<d_list.size(); i++) {
	    		if(d_list.get(i)[1]==min) {
	    			k -= d_list.get(i)[1];
	    			d_list.remove(i);
	    			return k;
	    		}
	    	}	
	    	return 0;
	    }	    
	}
}