package DynamicProgramming;

import java.util.Scanner;
// dp array -1

public class LCSwithDP {
    static int LCS(String x,String y,int m,int n,int[][] dp){
        if(m==0 || n==0){
            return 0;
        }
        if(x.charAt(m-1)==y.charAt(n-1)){
            if(dp[m-1][n-1]==-1){
                dp[m-1][n-1]=LCS(x,y,m-1,n-1,dp);
            }
            dp[m][n]= 1+dp[m-1][n-1];
        }
        else{
            if(dp[m-1][n]==-1){
                dp[m-1][n]=LCS(x,y,m-1,n,dp);
            }
            if(dp[m][n-1]==-1){
                dp[m][n-1]=LCS(x,y,m,n-1,dp);
            }
            dp[m][n]=Math.max(dp[m-1][n],dp[m][n-1]);
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String y=sc.next();
        int m=x.length()+1;
        int n=y.length()+1;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(LCS(x,y,x.length(),y.length(),dp));
    }
}
