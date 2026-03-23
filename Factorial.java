import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int factorial = 1; 
        System.out.println("Please enter the number that you want to calculate the factorial of: ");
        int num = Integer.parseInt(sc.nextLine()); 
        for (int i = 1; i<num+1; i++){
            factorial = factorial * 1; 
        }
        System.out.println("The factorial of " + num + "is: " + factorial);
    }     
}
