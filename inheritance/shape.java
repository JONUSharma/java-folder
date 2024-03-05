package inheritance;

public class shape {
    public static class Rectangle{
        double lenght;
        double widht;

        public void display_area()
        {
            this.lenght = 34;
            this.widht = 34;

            System.out.println("The area of Rectangle is " + lenght * widht);
        }
    
    }
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        rectangle.display_area();
    }
}
