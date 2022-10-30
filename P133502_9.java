import java.util.*;
import java.util.stream.*;

/*
채점 결과
정확성: 47.1
합계: 47.1 / 100.0

스트링으로 글자를 넣어주면서 삭제해도 속도가 매우 느림
 */

public class P133502_9 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        String ingre = "";
	        for(int i=0; i<ingredient.length; i++) {
	        	ingre += Integer.toString(ingredient[i]);
	        	
	        	if(ingre.contains("1231")) {
	        		answer++;
	        		ingre = ingre.replaceFirst("1231", "");
	        	}
	        }      
	        	        
	        return answer;
	    }
	}
}