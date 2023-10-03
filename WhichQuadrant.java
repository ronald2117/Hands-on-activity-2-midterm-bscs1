import java.util.*;

public class WhichQuadrant{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x, y;

        System.out.println("Enter the value of x:");
        x = input.nextDouble();
        System.out.println("Enter the value of y:");
        y = input.nextDouble();

        if((x > 0) && (y > 0)){
            System.out.println("First Quadrant");
        } else if((x < 0) && (y > 0)){
            System.out.println("Second Quadrant");
        } else if((x < 0) && (y < 0)){
            System.out.println("Third Quadrant");
        } else if((x > 0) && (y < 0)){
            System.out.println("Fourth Quadrant");
        } else if(x == 0){
            if(y == 0) {
                System.out.println("Origin");
            }else if(y > 0){
                System.out.println("Between Quadrant 1 & 2");
            } else{
                System.out.println("Between Quadrant 3 & 4");
            }
        } else{
            if(x < 0){
                System.out.println("Between Quadrant 2 & 3");
            } else {
                System.out.println("Between Quadrant 1 & 4");
            }
        }

    }
}
