import java.util.HashMap;

public class P42862{
	class Solution {
	       public int solution(int n, int[] lost, int[] reserve) {
	           int answer = 0;
	           HashMap<Integer, Integer> map = new HashMap<>();
	           
	           for(int i=0; i<n; i++) {
	              map.put(i+1, 1);
	           }
	           for(int i=0; i<lost.length; i++) {
	              map.replace(lost[i],0);
	           }
	           for(int i=0; i<reserve.length; i++) {
	              map.replace(reserve[i], map.get(reserve[i])+1);
	           }
	            
	            
	           for(int i=0; i<n; i++) {
	              if(map.get(i+1)<1){
	                    if(i>0 && map.get(i)>1){
	                    map.replace(i, 1);
	                    map.replace(i+1, 1);
	                    continue;
	                    }

	                    if(i<n-1 && map.get(i+2)>1){
	                    map.replace(i+2, 1);
	                    map.replace(i+1, 1);
	                    continue;
	                    }
	              }
	            }  
	       
	       
	       
	       
	           for(int i=0; i<n; i++) {
	              if(map.get(i+1)>0) {
	                 answer++;
	              }
	           } 
	           
	           
	           return answer;
	       }
	   }
}
