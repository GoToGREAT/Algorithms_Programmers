import java.util.*;

// 시간 초과로 인한 오답 발생
// 정확성: 55.2
// 효율성: 0.0
// 합계: 55.2 / 100.0
public class P12973 {
	class Solution
	{
	    public int solution(String s)
	    {
	    	String[] s_arr = s.split("");
    	    List<String> list = new ArrayList<>(Arrays.asList(s_arr));
	    	
	    	for(int q=0; q<s_arr.length; q++) {
		    	for(int i=0; i<list.size()-1; i++) {
		    		if(list.get(i).equals(list.get(i+1))){
		    			list.remove(i+1);
	    			    list.remove(i);
		    			break;
		    		}
		    	}
	    	}
	    	
	    	if(list.size()==0)return 1;
	    	else return 0;
	    }
	}
}