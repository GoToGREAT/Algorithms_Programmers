/*
채점 결과
정확성: 90.6
합계: 90.6 / 100.0
*/
// 대각선 방향일 때 하나는 x여도 상관하지 않는다.
public class P81302_1 {
	class Solution {
	    public int[] solution(String[][] places) {
	    	int[] answer = new int[5];	    	
	    	for(int i=0; i<5; i++) {	    		
	    		String[] now_arr = places[i];
	    		boolean rigth = false;
	    		for(int q=0; q<5; q++) {
	    			for(int w=0; w<5; w++) {
	    				if(now_arr[q].charAt(w)==80) {
	    					if(w+1<5 && now_arr[q].charAt(w+1)==80) {
	    						rigth = true;
	    						break;
	    					} else if(w+2<5 && now_arr[q].charAt(w+1)!=88 && now_arr[q].charAt(w+2)==80) {
	    						rigth = true;
	    						break;
	    					} else if(q+1<5 && now_arr[q+1].charAt(w)==80) {
	    						rigth = true;
	    						break;
	    					} else if(q+2<5 && now_arr[q+1].charAt(w)!=88 && now_arr[q+2].charAt(w)==80) {
	    						rigth = true;
	    						break;
	    					} else if(w+1<5 && now_arr[q].charAt(w+1)!=88
	    							&& q+1<5 && now_arr[q+1].charAt(w)!=88
	    							&& now_arr[q+1].charAt(w+1)==80) {
	    						rigth = true;
	    						break;
	    					} else if(w-1>=0 && now_arr[q].charAt(w-1)!=88
	    							&& q+1<5 && now_arr[q+1].charAt(w)!=88
	    							&& now_arr[q+1].charAt(w-1)==80) {
	    						rigth = true;
	    						break;
	    					}
	    				}
	    			}
	    			if(rigth) break;
	    		}
	    		if(rigth) answer[i]= 0;
	    		else answer[i]=1;
	    	}	
	        return answer;
	    }
	}
}