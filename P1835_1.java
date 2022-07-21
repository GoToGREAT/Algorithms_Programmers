import java.util.*;

// name을 활용하여 처음부터 문자열로 작성
public class P1835_1 {
	class Solution {
	    public int solution(int n, String[] data) {
	    	String[] name = {"","A", "C", "F", "J", "M", "N", "R", "T"};
	    	
	    	List<String> list = new ArrayList<>();
			for(int q=1; q<=8; q++) {
				for(int w=1; w<=8; w++) {
					if(q==w) continue;				
					for(int e=1; e<=8; e++) {
						if(q==e || w==e) continue;					
						for(int r=1; r<=8; r++) {
							if(q==r || w==r || e==r) continue;						
							for(int t=1; t<=8; t++){
								if(q==t || w==t || e==t || r==t) continue;							
								for(int y=1; y<=8; y++) {
									if(q==y || w==y || e==y || r==y || t==y) continue;								
									for(int u=1; u<=8; u++) {
										if(q==u || w==u || e==u || r==u || t==u || y==u) continue;									
										for(int i=1; i<=8; i++) {
											if(i!=q && i!=w && i!=e && i!=r && i!=t && i!=y && i!=u) {
												String a = name[q];
												a += name[w];
												a += name[e];
												a += name[r];
												a += name[t];
												a += name[y];
												a += name[u];
												a += name[i];
												list.add(a);
											}
										}
									}
								}
							}
						}
					}
				}
			}
			
			for(int i=0; i<n; i++) {
				String condition = data[i];
				String[] arr = condition.split("");
				int con = Integer.parseInt(arr[4])+1;
				
				for(int e=list.size()-1; e>=0; e--) {
					String check =list.get(e);
					int naame1 = check.indexOf(arr[0]);
					int naame2 = check.indexOf(arr[2]);
					if(arr[3].equals("=")) {
						if(Math.abs(naame1-naame2)!=con) list.remove(e);
					} else if(arr[3].equals(">")) {
						if(Math.abs(naame1-naame2)<=con) list.remove(e);
					} else if(arr[3].equals("<")) {
						if(Math.abs(naame1-naame2)>=con) list.remove(e);
					}
				}
				
			}
	        return list.size();
	    }
	}
}
