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
                    if(phone_book[i].indexOf(phone_book[k]) != -1) {
		// 접두어 체크가 안 됨
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