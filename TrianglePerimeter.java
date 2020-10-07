import java.util.Scanner;


public class TrianglePerimeter {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first edge of the triangle: ");
        int edge1 = input.nextInt();
        System.out.print("Enter second edge of the triangle: ");
        int edge2 = input.nextInt();
        System.out.print("Enter third edge of the triangle: ");
        int edge3 = input.nextInt();

        if(edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge1 + edge3 > edge2) {
            System.out.println("The perimeter is " + (edge1 + edge2 + edge3));
        } else {
            System.out.println("Invalid triangle edges!");
        }

    }
}
