import java.util.*;

// 스택을 써야한다는 힌트를 확인함.
public class P12973_1 {
	class Solution
	{
	    public int solution(String s)
	    {
	    	String[] s_arr = s.split("");
    	    List<String> list = new ArrayList<>();
	    	
	    	for(int i=0; i<s_arr.length; i++) {
	    		list.add(s_arr[i]);
	    		
	    		int size = list.size();
	    		if(size>=2) {
	    			if(list.get(size-1).equals(list.get(size-2))) {
	    				list.remove(size-1);
	    				list.remove(size-2);
	    			}	    			
	    		}
	    	}
	    	
	    	if(list.size()==0)return 1;
	    	else return 0;
	    }
	}
}