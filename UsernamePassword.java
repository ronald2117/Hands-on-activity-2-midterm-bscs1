import java.util.*;
import java.io.*;

public class UsernamePassword{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String username, password, inputtedUsername, inputtedPassword;

        username = "ronald";
        password = "thebest";
        
        System.out.println("Username:");
        inputtedUsername = input.nextLine();

        System.out.println("Password:");
        inputtedPassword = input.nextLine();

        if(password.equals(inputtedPassword) && username.equals(inputtedUsername)){
            System.out.println("Login Successful");
        }
        else{
            System.out.println("Wrong username or password");
        }
    }
}
