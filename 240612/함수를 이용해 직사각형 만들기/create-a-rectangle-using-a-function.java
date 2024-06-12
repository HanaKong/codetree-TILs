import java.util.Scanner;

public class Main {
    public static void createRectangle(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        createRectangle(x, y);
        sc.close();
    }
}