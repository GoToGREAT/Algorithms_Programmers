import java.util.*;

// 베이직하게 통과
public class P1835 {
	class Solution {
	    public int solution(int n, String[] data) {
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
												String a = Integer.toString(q);
												a += Integer.toString(w);
												a += Integer.toString(e);
												a += Integer.toString(r);
												a += Integer.toString(t);
												a += Integer.toString(y);
												a += Integer.toString(u);
												a += Integer.toString(i);
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
			
			String[] name = {"A", "C", "F", "J", "M", "N", "R", "T"};
			
			for(int i=0; i<n; i++) {
				String condition = data[i];
				String[] arr = condition.split("");
				
				String name1="";
				String name2="";
				for(int q=0; q<name.length; q++) {
					if(arr[0].equals(name[q])) name1=Integer.toString(q+1);
					else if(arr[2].equals(name[q])) name2=Integer.toString(q+1);
				}
				
				int con = Integer.parseInt(arr[4])+1;
				
				for(int e=list.size()-1; e>=0; e--) {
					String check =list.get(e);
					int naame1 = check.indexOf(name1);
					int naame2 = check.indexOf(name2);
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
