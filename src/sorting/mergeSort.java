package sorting;
import java.util.*;
public class mergeSort {
    static void mergeS(int[] a,int l,int u){
        if(l<u){
            int mid=l+(u-l)/2;
            mergeS(a,l,mid);
            mergeS(a,mid+1,u);
//            merge(a,l,mid,u);
        }
    }
//    static void merge(int[] a,int l,int mid,int u){
//        int n1=mid-l;
//        int n2=u-mid+1;
//        int[] q=new int[];
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int l=0;
        int u=n-1;
        mergeS(a,l,u);
    }
}
