package Stack;
import java.util.*;
public class excelColumn {
    static void columnNumber(String str){
        Stack<Character> s=new Stack<>();
        for(char a:str.toCharArray()){
            s.push(a);
        }
        char c;
        int count=0;
        int p=0;
        while(!s.isEmpty()){
            c=s.pop();
            count=count+(int)(Math.pow(26,p)*(c-'A'+1));
            p++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.nextLine();
        columnNumber(str);
    }
}