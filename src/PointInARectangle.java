import java.util.Scanner;

public class PointInARectangle {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Enter x coordinate: "
        );
        double x = input.nextDouble();

        System.out.print(
                "Enter y coordinate: "
        );
        double y = input.nextDouble();

        if (x >= -4 && x <= 6) {
            if (y >= -1.5 && y <= 3.5)
                System.out.print(
                        "point (" + x+","+y+") is within the square limits"
                );
            else
                System.out.print(
                        "Point ("+x+","+y+") is outside the square limits"
                );
        }
        else
            System.out.print(
                    "Point ("+x+","+y+") is outside the limits"
            );
    }
}
