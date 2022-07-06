import java.util.*;

// 효율성 테스트 통과 못함
public class P42577_4 {
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int num = phone_book.length;
        
        Arrays.sort(phone_book);
        
        HashMap<Integer, List<String>> map = new HashMap<>();
        
        for(int i=0; i<num; i++){
        	Integer key = (int) phone_book[i].charAt(0);
        	if(map.containsKey(key)) {
        		List<String> list = map.get(key);
        		list.add(phone_book[i]);
        		map.replace(key, list);
        	} else {
        		List<String> list = new ArrayList<>();
        		list.add(phone_book[i]);
        		map.put(key, list);
        	}
        }
        
        
        Object[] key = map.keySet().toArray();
        
        for(int i=0; i<key.length; i++) {
        	List<String> list = map.get(key[i]);
        	for(int q=0; q<list.size(); q++) {
        		for(int w=list.size()-1; w>q; w--) {
        			if(list.get(w).startsWith(list.get(q))) return false;
        		}
        	}
        }
        
        return answer;
    }
 }
}