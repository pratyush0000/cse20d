import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        
        int sum = number1 + number2;
        System.out.println("The sum is: " + sum);
        
        input.close();
}

}
