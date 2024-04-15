package BinarySearch;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int d=sc.nextInt();
        if(9*d<s){
            System.out.println(-1);
        }
        int[] ans=new int[d];
        for(int i=0;i<d;i++){
            if(s>=9){
                ans[i]=9;
                s=s-9;
            }
            else{
                ans[i]=s;
                s=0;
            }
        }
        for(int i=0;i<d;i++){
            System.out.print(ans[i]);
        }
        System.out.println();
    }
}
