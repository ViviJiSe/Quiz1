import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Circle circle=new Circle(numReqFromUser("Type the radius of the circle: "));
        System.out.println(circle);

        Triangle triangle= new Triangle(numReqFromUser("Type the side of the triangle: "),
                numReqFromUser("Type the height of the triangle:"));
        System.out.println(triangle);

        Pyramid pyramid = new Pyramid(triangle,
                numReqFromUser("Type the height of the pyramid: "),
                numReqFromUser("Type the side of the pyramid:"));
        System.out.println(pyramid);

    }

    public static int numReqFromUser(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }


}
