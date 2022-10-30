import java.util.*;
import java.util.stream.*;

/*
 문제 푸는 중
 */

public class P133502_10 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        StringBuilder ingreBulid = new StringBuilder();
	        for(int i=0; i<ingredient.length; i++) {
	        	ingreBulid.append(ingredient[i]);
	        }
	        
	        String ingre = ingreBulid.toString();
	        
	        while(true) {
	        	if(!ingre.contains("1231")) break;
	        	else {
	        		answer ++;
	        		ingre = ingre.replaceFirst("1231", "");
	        	}
	        }
	        
	        return answer;
	    }
	}
}