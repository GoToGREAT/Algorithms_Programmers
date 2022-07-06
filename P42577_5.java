import java.util.*;

// 효율성 테스트 통과 못함
public class P42577_5 {
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int num = phone_book.length;
        
        Arrays.sort(phone_book);
        
        for(int i=0; i<num-1; i++){        	
        		if(phone_book[i+1].startsWith(phone_book[i])) return false;                    
        }        
        return answer;
    }
 }
}