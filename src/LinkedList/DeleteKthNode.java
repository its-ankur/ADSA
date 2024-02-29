package LinkedList;

import java.util.Scanner;

public class DeleteKthNode {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a>=0){
            list.insertAtEnd(a);
            a=sc.nextInt();
        }
        System.out.println();
        int k=sc.nextInt();
        list.delK(k);
    }
}
