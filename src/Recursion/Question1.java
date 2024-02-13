package Recursion;
import java.util.*;
public class Question1 {
    static int count(int[] a,int low,int high){
        if (high < low)
            return 0;
        if (high == low)
            return low;
        int mid = low + (high - low) / 2;
        if (mid < high && a[mid + 1] < a[mid])
            return (mid + 1);
        if (mid > low && a[mid] < a[mid - 1])
            return mid;
        if (a[high] > a[mid])
            return count(a, low, mid - 1);

        return count(a, mid + 1, high);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=0;
        int h=n-1;
        int mid=l+((h-l)/2);
        int c=count(a,l,h);
        System.out.println(c);
    }
}
