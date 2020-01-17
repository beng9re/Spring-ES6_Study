package com.my;

public class AI {
	 int answer = -1;

	    public int solution(int N, int number) {
	        dfs(N, 0, 0, number, "");
	        return answer;
	    }
	    					
	    public void dfs(int n, int pos, int num, int number, String s) {
	       System.out.println("CALL :" +  s);
	     
	    	
	    	if (pos > 8)
	            return;
	        
	        if (num == number) {  
	        	
	            if (pos < answer || answer == -1) {
	                System.out.println(s);
	                answer = pos;
	            }
	            
	            return;
	        }
	        
	        int nn=0;
	        for (int i = 0; i < 8; i++) {
	            nn=nn*10+n;
	            dfs(n, pos + 1+i, num + nn, number, s + "+");
	            dfs(n, pos + 1+i, num - nn, number, s + "-");
	            dfs(n, pos + 1+i, num * nn, number, s + "*");
	            dfs(n, pos + 1+i, num / nn, number, s + "/");
	        }
	        
	    }
	     //5!
	    public int  factoryStart(int su) {
	    	
	    	int result =1;
	    	for(int i=1; i<su;i++) {
	    		result=result*(num(i));
	    	}
	    	
	    	return result;
	    	
	    }
	    
	    public int num (int n) {
	    	if(n==1) {
	    		return 1;
	    	}else {
	    		return n * num(n-1);
	    	}
	    }
	    
	    public static void main(String[] args) {
			AI a =new AI();
			//System.out.println(a.solution(5, 12));
			System.out.println(a.num(4));
			
		}
	
	
}
