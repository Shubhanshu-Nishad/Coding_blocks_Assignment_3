import java.util.*;
public class Main {
	
    public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str.charAt(0));
		for(int i = 0;i<str.length()-1;i+=1){
			
			int temp = (int) str.charAt(i+1) - (int) str.charAt(i);
			System.out.print(temp);
			System.out.print(str.charAt(i+1));
			
				
		}
    }
}

// https://hack.codingblocks.com/app/contests/3539/489/problem
