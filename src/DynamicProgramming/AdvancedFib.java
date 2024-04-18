package DynamicProgramming;
import java.util.*;
public class AdvancedFib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j!=i){
                    System.out.print(dp[j]+"*");
                }
                else{
                    System.out.print(dp[j]);
                }
            }
            if(i<n-1) {
                System.out.print(" + ");
            }
        }
    }
}
