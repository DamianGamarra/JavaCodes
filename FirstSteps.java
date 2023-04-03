import java.util.Scanner;

public class FirstSteps {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        //this nextLine method is for clean our scanner so i can print the favorite food
        scanner.nextLine();


        //this will not be printed without the nextLine method up here
        System.out.println("What's your favorite food?");
        String food = scanner.nextLine();



        System.out.println("Hola" + " " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);



    }
}


