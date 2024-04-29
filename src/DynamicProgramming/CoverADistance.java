package DynamicProgramming;
import java.util.*;
public class CoverADistance {
    public static int totalWays(int n,int k,int[] ways) {
        if(n==1 || n==0) {
            return 1;
        }
        int w=0;
        for(int i=1;i<=k && n-i>=0;i++) {
            if(ways[n-i]==0) {
                w += totalWays(n - i, k,ways);
            }
            else{
                w+=ways[n-i];
            }
        }
        ways[n] = w;
        return w;
    }
    static public int total(int n,int k){
        int[] ways=new int[n+1];
        ways[0]=1;
        ways[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=k && i-j>=0;j++){
                ways[i]+=ways[i-j];
            }
        }
        return ways[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int[] ways=new int[n+1];
        System.out.println(total(n,k));
    }
}
