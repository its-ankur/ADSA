package Stack;

import java.util.Scanner;

public class excelColumnReverse {

    static String columnTitle(int n) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            n--;
            char ch = (char) (n % 26 + 'A');
            result.insert(0, ch);
            n /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the column number: ");
        int n = scanner.nextInt();

        String title = columnTitle(n);
        System.out.println("The Excel column title is: " + title);
    }
}
