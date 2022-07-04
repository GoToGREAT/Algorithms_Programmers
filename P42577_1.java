import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int num = phone_book.length;
        
        Arrays.sort(phone_book);
        
        for(int i=0; i<num; i++){
            for(int k=0; k<num; k++){
                if(i==k) continue;
                else {
                    if(phone_book[i].indexOf(phone_book[k]) == 0) {
		// 효율성 체크 통과 안됨.
                        answer = false;
                        break;
                    }
                    
                }
            }
            if(answer==false) break;
        }        
        return answer;
    }
}