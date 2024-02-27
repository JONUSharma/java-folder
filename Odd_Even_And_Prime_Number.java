import java.util.Scanner;

public class Odd_Even_And_Prime_Number {
 public static void main(String[] args) {
    try (Scanner Sc = new Scanner(System.in)) {
        System.out.println("Enter the number.");
        int num = Sc.nextInt();
        if(num%2==0)
        {
            System.out.println(num + " is Even number.");
            System.out.println(num + " is not prime number");

        }
        else{
            System.out.println( num +" is odd number.");
            System.out.println(num + " is a prime number.");
        }
    }
 }   
}
