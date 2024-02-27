// import java.util.Scanner;

// class Rectangle
// {
// Rectangle()
// {
//     int l ;
//     int b;
//     Scanner sc  = new Scanner(System.in);
//     System.out.println("Enter lenght of rectangle.");
//     l = sc.nextInt();
//     System.out.println("Enter Breadth of rectangle.");
//     b= sc.nextInt();

//     int area  = l*b;
//     System.out.println("The area of rectangle is " + area);
// }
// }
// public class Area_Using_Constructor {

//     public static void main(String[] args) {
//      Rectangle r =new   Rectangle();
//     }
// }

import java.util.Scanner;

/**
 * Area_Using_Constructor
 */
class square{
    /**
     * 
     */
    square()
    {
        int side;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(("Enter any side of square"));
            side = sc.nextInt();
        }
        int area = side*side;
        System.out.println("Area of square is " + area);
    }
}
public class Area_Using_Constructor {
public static void main(String[] args) {
    new square();

}
    
}