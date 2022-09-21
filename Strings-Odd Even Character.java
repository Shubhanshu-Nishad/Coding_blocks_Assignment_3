import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0;i<str.length();i++){
			int ch = (int) str.charAt(i);
			if( i % 2 == 0 ){
				ch++;
				System.out.print((char)ch);
			}
			else
			{
				ch--;
				System.out.print((char)ch);
			}
				
				
		}
    }
}

// https://hack.codingblocks.com/app/contests/3539/457/problem
