package programmers;

import java.util.HashMap;

public class P42826 {
	class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	        int answer = 0;
	        HashMap<Integer, Integer> map = new HashMap<>();
	        for(int i=0; i<n; i++){
	            map.put(i+1,1);
	        }
	        for(int i=0; i<lost.length; i++){
	            map.replace(lost[i],map.get(i)-1);
	        }
	        for(int i=0; i<reserve.length; i++){
	            map.replace(reserve[i],map.get(i)+1);
	        }
	        for(int i=1; i<n+1; i++){
	            if(map.get(i)==2){
	                if(i>2 && map.get(i-1)==0){
	                         map.replace(i-1,1);
	                         map.replace(i,1);
	                            break;
	                    } else if(i<n && map.get(i+1)==0){
	                         map.replace(i+1,1);
	                         map.replace(i,1);
	                         break;
	                    } 
	                }
	            }
	        
	        for(int i=0; i<n; i++){
	            if(map.get(i+1)>0) answer++;
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		
	}
}
