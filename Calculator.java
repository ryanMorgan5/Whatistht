import java.util.Scanner;
//I really hope I did this right -_-
public class Calculator
{
    public static void main(String[] args)
    {
        //Variables to be defined by scanner.
        Scanner myScanner = new Scanner(System.in);
        double firstOperand;
        double secondOperand;
        int operation;
        double result;

        System.out.println("Enter first operand:");
        firstOperand = myScanner.nextDouble();

        System.out.println("Enter second operand:");
        secondOperand = myScanner.nextDouble();

        System.out.println("Calculator Menu" +"\n---------------" +"\n1. Addition"+"\n2. Subtraction"+"\n3. Multiplication"+"\n4. Division");
        System.out.println("Which operation do you want to perform?");
        operation = myScanner.nextInt();

        //operations to be determined (+-*/)
        if (operation < 1 || operation > 4)
        {
            System.out.println("Error: Invalid selection! Terminating program.");
        }
        //If the operation variable falls within range then the operation will run.
        else{
            if (operation == 1)
            {
                result = firstOperand + secondOperand;
            } else if (operation == 2)
            {
                result = firstOperand - secondOperand;
            } else if (operation == 3)
            {
                result = firstOperand * secondOperand;
            } else
            {
                result = firstOperand / secondOperand;
            }

            System.out.println("The result of the operation is " + result + ". Goodbye!");
        }
    }
}
