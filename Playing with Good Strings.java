import java.util.*;
public class Main {
	public static boolean vowel(char ch){
		if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
			return true;
		return false;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int ans = 0;
		int count=0;
		for(int i = 0 ; i<str.length();i++){
			char ch = str.charAt(i);
			if(vowel(ch))
				count++;
			else{
				ans = Math.max(count,ans);
				count=0;
			}
		}
		ans = Math.max(count,ans);
		System.out.println(ans);
    }
}
//https://hack.codingblocks.com/app/contests/3539/549/problem
