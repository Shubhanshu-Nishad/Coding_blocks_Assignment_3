import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0;i<str.length();i++){
			int ch = (int) str.charAt(i);
			if( ch >64 && ch < 91 ){
				ch+=32;
				System.out.print((char)ch);
			}
			else
			{
				ch-=32;
				System.out.print((char)ch);
			}
				
		}
    }
}

// https://hack.codingblocks.com/app/contests/3539/445/problem
