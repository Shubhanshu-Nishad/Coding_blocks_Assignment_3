import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
        int count=0;
		for(int i = 0;i<str.length()-1;i++){
			if( (int) str.charAt(i) == (int) str.charAt(i+1))
				count++;
			else{
				if(count>0){
					System.out.print(str.charAt(i)+""+(count+1));
				}
                count=0;
            }
		}
		if(count>0)
			System.out.print(str.charAt(str.length()-1)+""+(count+1));	
    }
} 

// https://hack.codingblocks.com/app/contests/3539/468/problem
