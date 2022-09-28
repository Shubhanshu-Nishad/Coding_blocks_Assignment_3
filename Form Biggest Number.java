import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			String[] s = new String[n];
			String ans = "";
			for(int i=0;i<n;i++){
			s[i]=String.valueOf(arr[i]);
			}

			// we have converted int array into string because compareTo function 
			// campare one by one character in a given string.
			for(int i=0;i<n;i++){
				for(int j=0;j<n-i-1;j++){

					String s1 = s[j]+s[j+1];
					String s2 = s[j+1]+s[j];

					if(s1.compareTo(s2)<1){
						// swap adjacent element 
						String str = s[j];
						s[j]=s[j+1];
						s[j+1]=str;
					}
				}
			}
			if(s[0].equals("0")) System.out.println("0");

			for(int i =0;i<n;i++){
				ans += s[i];
			}
			System.out.println(ans);
		}
    }
}
// https://hack.codingblocks.com/app/contests/3539/1086/problem
