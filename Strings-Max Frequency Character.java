import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
        int count=0;
		int ans=0;
		char final_ans=' ';
		for(int i = 0;i<str.length()-1;i++){
			if( (int) str.charAt(i) == (int) str.charAt(i+1))
				count++;
			else{
				if(ans<count+1){
                final_ans = str.charAt(i);
				ans = count+1;
				}
                count=0;
            }
		}
        	
		if(ans<count+1){
            final_ans = str.charAt(str.length()-1);
		}
		System.out.print(final_ans);
    }
}
//https://hack.codingblocks.com/app/contests/3539/558/problem
