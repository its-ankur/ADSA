package DynamicProgramming;
import java.util.*;
public class LCSWithoutDP {
    static int LCS(String x,String y,int m,int n){
        if(m==0 || n==0){
            return 0;
        }
        if(x.charAt(m-1)==y.charAt(n-1)){
            return 1+LCS(x,y,m-1,n-1);
        }
        else{
            return Math.max(LCS(x,y,m-1,n),LCS(x,y,m,n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        System.out.println(LCS(x,y,x.length(),y.length()));
    }
}
