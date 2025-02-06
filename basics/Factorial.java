import java.util.Scanner;

public class Factorial {

        static int factorial(int n) 
        { 
            int res = 1, i; 
            for (i = 2; i <= n; i++) 
                res *= i; 
            return res; 
        } 
      
        // main method 
        public static void main(String[] args) 
        { 
            Scanner inp = new Scanner(System.in);
            System.out.print("Enter number to find factorial of: ");
            int num = inp.nextInt();


            System.out.println("Factorial of " + num + " is "+ factorial(num)); 
            inp.close();
        } 
}
