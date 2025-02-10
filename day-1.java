import java.util.Scanner;

public class Day-1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Task 1: Print Hello and Name
        System.out.println("Hello"); 
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);
        
        // Task 2: Sum of Two Numbers
        int x = 74;
        int y = 36;
        System.out.println("Sum of "+x+" and "+y+" is " + (x + y));
        
        // Task 3: Division of Two Numbers
        int a = 50;
        int b = 3;
        System.out.println("Division of "+a+" and "+b+" is " + (a/b));
        
        // Task 4: Arithmetic Operations
        int num1 = 10;
        int num2 = 3;
        int addition = num1 + num2;
        System.out.println("Addition:" + addition);
        
        int substraction = num1 - num2;
        System.out.println("Substraction:" + substraction);
        
        int multiplication = num1 * num2;
        System.out.println("Multiplication:" + multiplication);
        
        int division = num1 / num2;
        System.out.println("Division:" + division);
        
        int modulus = num1 % num2;
        System.out.println("Modulus:" + modulus);
        
        
        // Task 5: Product of Two Numbers
        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Product of " + firstNum + " and " + secondNum + " is " + (firstNum * secondNum));
        
        scanner.close();
    }
}
