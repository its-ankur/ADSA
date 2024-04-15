package BinarySearch;

import java.util.Scanner;

public class LargestRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();

        if (s == 0 && d == 1) {
            System.out.println(0);
            return;
        }

        if (s > 9 * d) {
            System.out.println(-1);
            return;
        }

        int[] ans = new int[d];

//        for (int i = d - 1; i >= 0; i--) {
//            if (s >= 9) {
//                ans[i] = 9;
//                s -= 9;
//            } else {
//                ans[i] = s-1;
//                s = 0;
//            }
//        }
        int t=d;
        for(int i=0;i<d;i++){
            if(i==0) {
                int j = 1;
                while (j <= 9) {
                    if (s - j <= 9 * (t - 1)) {
                        ans[i] = j;
                        s = s - j;
                        System.out.println("a1 "+j);
                        t--;
                        break;
                    }
                    j++;
                }
            }
            else{
                int j = 0;
                while (j <= 9) {
                    if (s - j == 9 * (t - 1)) {
                        ans[i] = 9;
                        s = s - j;
                        System.out.println("a2 "+9);
                        t--;
                        break;
                    }
                    else{
                        ans[i]=0;
                        System.out.println("a3 "+0);
                        t--;
                    }
                    j++;
                }
            }
        }

        for (int i = 0; i < d; i++) {
            System.out.print(ans[i]);
        }
        System.out.println();
    }
}
