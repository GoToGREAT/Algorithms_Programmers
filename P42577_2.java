import java.util.*;

// 효율성 테스트 통과 못함
public class P42577_2 {
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int num = phone_book.length;
        
        Arrays.sort(phone_book);
        
        for(int i=0; i<num; i++){
        	for(int k=num-1; k>i; k--){
        		if(phone_book[k].startsWith(phone_book[i])) return false;
            }           
        }        
        return answer;
    }
 }
}