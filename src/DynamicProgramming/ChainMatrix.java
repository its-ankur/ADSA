package DynamicProgramming;
import java.util.*;
public class ChainMatrix {
    static int mat(int[] p,int i,int j){
        if(i==j){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int count=mat(p,i,k)+mat(p,k+1,j)+p[i-1]*p[k]*p[j];
            if(count<min){
                min=count;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(mat(a,1,a.length-1));
    }
}
