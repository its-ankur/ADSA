package Recursion;
import java.util.*;
public class Question2 {
    static int min=Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;
    static void sum(int[] a,int n){
        if(n<0){
            return;
        }
        if(a[n]>max){
            max=a[n];
        }
        if(a[n]<min){
            min=a[n];
        }
        sum(a,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sum(a,n-1);
        System.out.println(min+max);
    }
}
