import java.util.*;
public class Main {
	public static boolean isPalindromic(String s,int i,int j){
        if (i > j)
        return true;
 
        if (s.charAt(i) != s.charAt(j))
        return  false;
 
        return isPalindromic(s, i + 1, j - 1);
    }
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(isPalindromic(str,i,j)){
                    count++;
                }    
            }
        } 
        System.out.println(count);
    }
}

// https://hack.codingblocks.com/app/contests/3539/1060/problem
