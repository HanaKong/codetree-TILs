import java.util.Scanner;

public class Main {
    public static void makeNumberSquare(int row) {
        int num = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(num + " ");
                num++;
                if(num > 9) num = 1;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int num = sc.nextInt();
        makeNumberSquare(num);
    }
}