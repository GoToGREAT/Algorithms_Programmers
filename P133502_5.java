/*
채점 결과
정확성: 58.8
합계: 58.8 / 100.0

스트링은 매번 글자를 더 할 때마다 새로운 주소값 생성으로 시간 효율이 낮음
스트링 빌더 사용
 */

public class P133502_5 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        StringBuilder ingreBulid = new StringBuilder();
	        for(int i=0; i<ingredient.length; i++) {
	        	ingreBulid.append(ingredient[i]);
	        }
	        
	        String ingre = ingreBulid.toString();
	        
	        while(true) {
	        	if(ingre.length() == ingre.replaceFirst("1231", "").length()) break;
	        	else {
	        		answer ++;	        		
	        		ingre = ingre.replaceFirst("1231", "");
	        	}
	        }
	        
	        return answer;
	    }
	}
}