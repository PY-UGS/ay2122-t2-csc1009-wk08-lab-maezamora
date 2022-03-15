import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");

        try{
            float radius = input.nextFloat();
            if(radius<0){
                throw new IllegalArgumentException("Please enter a positive number!");
            }
            else {
                CircleWithException circle = new CircleWithException(radius);
                if(circle.getArea()>1000){
                    throw new Exception("Area is bigger than 1000.");
                }
                System.out.println("The area is " + circle.getArea());
                System.out.println("The diameter is " + circle.getDiameter());
            }
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
