import java.util.*;

public class Main {
    public static void printNLines(int rowNum) {
        for (int i = 0; i < rowNum; i++) {
            // for (int j = 0 ; j < ?; j++) {
            System.out.println("12345^&*()_");
            // }
            // System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        printNLines(rowNum);
        sc.close();
    }
}