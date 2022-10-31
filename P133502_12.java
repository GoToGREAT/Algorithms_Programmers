import java.util.*;
import java.util.stream.*;

/*
500개씩 나눠서 계산함

채점 결과
정확성: 64.7
합계: 64.7 / 100.0

100개와 동일 그러나 속도가 빨라짐
 */

public class P133502_12 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        String that = "";
	        
	        int start = 0;
	        
	        StringBuilder build = new StringBuilder();
	        
	        while(start<ingredient.length) {
	        	if(build.length()<500) {
	        		build.append(ingredient[start++]);
	        	} else {	        		
	        		that += build.toString();
	        		build = new StringBuilder();
	        		
	        		while(that.contains("1231")) {
	        			that = that.replaceFirst("1231","");
	        			answer++;
	        		}
	        		
	        	}           	
	        }
	        
	        that += build.toString();
    		
    		while(that.contains("1231")) {
    			that = that.replaceFirst("1231","");
    			answer++;
    		}
	        
	        
	        return answer;
	    }
	}
}