import java.util.*;

public class PythagoreanTheorem{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double a, b, c, side1, side2, hypothenuse;

        System.out.println("Enter Value of side1:");
        a = input.nextDouble();

        System.out.println("Enter Value of side2: ");
        b = input.nextDouble();

        System.out.println("Enter Value of side3: ");
        c = input.nextDouble();

        if(a > b && a > c){
            hypothenuse = a;
            side1 = c;
            side2 = b;
        } else if(b > a && b > c){
            hypothenuse = b;
            side1 = a;
            side2 = c;
        } else {
            hypothenuse = c;
            side1 = a;
            side2 = b;
        }

        double squareOfTwoSides = Math.pow(side1, 2) + Math.pow(side2, 2);

        if(squareOfTwoSides == Math.pow(hypothenuse, 2)){
            System.out.println("It is a Right Triangle");
        } else{
            System.out.println("It is not a Right Triangle");
        }

    }
}
