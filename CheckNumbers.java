import java.util.*;
import java.io.*;

public class CheckNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Enter number 1: ");
        num1 = input.nextDouble();
        System.out.println("Enter number 2");
        num2 = input.nextDouble();
        System.out.println("Enter number 3");
        num3 = input.nextDouble();
        
        if((num1 < num2) && (num2 < num3)){
            System.out.println("Increasing");
        }
        else if ((num1 > num2) && (num2 > num3)){
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neithet increasing nor decreasing");
        }
    }
}
