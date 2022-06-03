import java.util.Scanner;

public class InvertedPyramidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of cols: ");
        int cols = sc.nextInt();

        for(int i=0; i<rows-1; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
