import java.util.Scanner;

public class NumberChangingPyramidPattern {
    public static void printPattern(int n)
    {
        int i, j;
        int num = 1;
        // outer loop for rows
        for (i = 1; i <= n; i++) {
            // inner loops for rows (to print i nums in the row)
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            // new line for each row
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        System.out.print("Enter number of rows: ");
        
        Scanner input = new Scanner(System.in);
        int rownums = input.nextInt();
        printPattern(rownums);

        input.close();
    }
}

