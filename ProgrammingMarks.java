import java.util.*;

public class ProgrammingMarks{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Computer Programming 1 marks:");
        double cp1 = input.nextDouble();
        System.out.println("Computer Programming 2 marks:");
        double cp2 = input.nextDouble();
        System.out.println("Computer Programming 3 marks:");
        double cp3 = input.nextDouble();

        double totalInAllThree = cp1 + cp2 + cp3;
        double totalInOneAndTwo = cp1 + cp2;

        System.out.println("Sum of all three: " + totalInAllThree);
        System.out.println("Sum of 1 & 2: " + totalInOneAndTwo);

        if(cp1 >= 65 && cp2 >= 55 && cp3 >= 50 && (totalInAllThree >= 190 || totalInOneAndTwo >= 120)){
            System.out.println("PASSED");
        } else{
            System.out.println("FAILED");
        }
    }
}
