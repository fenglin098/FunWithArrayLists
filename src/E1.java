import java.util.ArrayList;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        String userInput;
        boolean answer=true;
        do{
            System.out.println("Please enter a color: ");
            Scanner keyboard = new Scanner(System.in);
            userInput = keyboard.next();
            if (userInput.equalsIgnoreCase("q")) {
                answer = false;
            }else {
                colors.add(userInput);
            }
        }while (answer == true);
        colors.add("yellow");
        colors.add("red");
        colors.add("blue");
        System.out.println(colors);
    }
}
