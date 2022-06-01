import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        System.out.println("Before Swapping: " + "x: " + x + "y: " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After Swapping: " + "x: " + x + "y: " + y);
    }
}
