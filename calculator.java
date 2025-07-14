import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a=sc.nextDouble();
        System.out.println("Enter the second number:");
        double b=sc.nextDouble();
        System.out.println("Enter the option(+,-,*,/):");
        char operator=sc.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+':
                result=a+b;
                break;

            case '-':
                result=a-b;
                break;

            case '*':
                result=a*b;
                break;

            case '/':
                if(b==0){
                    System.out.println("Error:Division by Zero!");
                    break;
                }else{
                    result=a/b;
                    break;
                }
        
            default:
                System.out.println("Enter a valid option!");
                break;
        }
        System.out.println("Result:"+ result );
    }
}
