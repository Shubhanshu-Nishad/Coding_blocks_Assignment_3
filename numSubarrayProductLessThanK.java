import java.util.*;
public class Main {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
       if (k<=1) return 0;
        int count = 0;
        int left = 0;
        int prod = 1 ;
        for(int r =0;r<nums.length;r++){
            prod *=nums[r];
            while(prod>=k){
                prod /=nums[left++];
            }
            count +=r-left +1;
        }
		return count;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(numSubarrayProductLessThanK(arr,k));
    }
}
// https://hack.codingblocks.com/app/contests/3539/2637/problem
