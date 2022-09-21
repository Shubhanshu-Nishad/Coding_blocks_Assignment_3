import java.util.*;
public class Main {
	public static int flipchar(String str, int k, char ch) {
		int si = 0;
		int ei = 0;
		int ans = 0;
		int flip = 0;

		for(int i =1 ;i<10;i++){
			for(int j =1 ;j<10;j++){
			}
		}

		
		while (ei < str.length()) {
			if (str.charAt(ei) == ch) {
				flip++;
			}
			// shrink krna hai
			while (flip > k && si <= ei) {
				if (str.charAt(si) == ch) {
					flip--;
				}
				si++;
			}
			// ans cal
			ans = Math.max(ans, ei - si + 1);
			ei++;

		}
		return ans;

	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String str = sc.next();

		int flipb = flipchar(str, k, 'b');
		int flipa = flipchar(str, k, 'a');

		System.out.println(Math.max(flipa, flipb));

    }
}
// https://hack.codingblocks.com/app/contests/3539/446/problem
