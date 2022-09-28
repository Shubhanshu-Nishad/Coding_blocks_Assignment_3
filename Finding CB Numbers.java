import java.util.*;
public class Main {
	public static int printSubString(String str){
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for(int len = 1;len<=str.length();len++){
			for(int si=0;si<=str.length()-len;si++){
				int ei = si+ len;
				String s = str.substring(si, ei);
				//System.out.println(s);
				//Integer.parseInt(s); // string to int
				//Long.parseLong(s); //  string to long
				if(isCBnumber(Long.parseLong(s)) && isVisited(visited,si,ei-1)){
					
					for (int i = si; i <= ei - 1; i++) {
						visited[i] = true;
					}
					count++;
				}
			}
		}
		return count;
	}

	public static boolean isVisited(boolean[] visited,int si,int ei){
		for(int i = si;i<=ei;i++){
			if(visited[i]==true)
				return false;
		}
		return true;
	}
	public static boolean isCBnumber(long n){
		int[] cb = {2,3,5,7,11,13,17,19,23,29};
		// point 1 
		if(n==1 || n==0 )
			return false;
		// point 2
		for(int i=0;i<cb.length;i++){
			if(cb[i]==n)
				return true;
		}
		// point 3 
		for(int i=0;i<cb.length;i++){
			if(n% cb[i]==0)
				return false;
		}
		return true;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cb = sc.nextInt();
		String str = sc.next();
		System.out.println(printSubString(str));
    }
}
// https://hack.codingblocks.com/app/contests/3539/165/problem
