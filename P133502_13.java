import java.util.*;
import java.util.stream.*;

/*
채점 결과
정확성: 100.0
합계: 100.0 / 100.0

build를 하면서 계속된 확인이 필요했음.
 */

public class P133502_13 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        StringBuilder build = new StringBuilder();
	        
	        for(int i=0; i<ingredient.length; i++) {
	        	build.append(ingredient[i]);
	        	if(build.length()>3 && build.subSequence(build.length()-4, build.length()).equals("1231")) {
	        		answer++;
	        		build.delete(build.length()-4, build.length());
	        	}
	        }
	        
	        return answer;
	    }
	}
}