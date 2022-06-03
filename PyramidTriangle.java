import java.util.Scanner;

public class PyramidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of cols: ");
        int cols = sc.nextInt();

        for(int i=1; i<=rows; i++) {
            for(int j=0; j<i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
