import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Outer loop for rows
        for (int ctr = 1; ctr <= rows; ctr++) {
            // Inner loop for printing stars
            for (int ast = 1; ast <= ctr; ast++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}