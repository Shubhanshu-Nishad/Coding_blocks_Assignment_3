import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0 ){
			String str = sc.next();
			boolean unique = true;
			for(int i = 0;i<str.length();i++){
				unique = true;
				for(int j=0;j<str.length();j++){
					if( i !=j  && str.charAt(i) == str.charAt(j)){
						unique = false;
						break;
					}
				}
				if(unique){
					System.out.println(str.charAt(i));
					break;
				}
			}
			if(unique==false){
					System.out.println("-1");
			}
		}
    }
}
// https://hack.codingblocks.com/app/contests/3539/563/problem
