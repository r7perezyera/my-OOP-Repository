import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {
    public static void main(String[] args){
        // get user ready to play
        System.out.println("Hi there! Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        Scanner entrada = new Scanner(System.in);
        String userName = entrada.nextLine();
        System.out.print("Hi " + userName + "! Which do you chose? (O)dds or (E)vens? ");
        String userChoice;
        userChoice = entrada.next();
        if(userChoice.equalsIgnoreCase("e")){
            System.out.println(userName + " has picked evens! The computer will be odds.");
        }else if(userChoice.equalsIgnoreCase("o")){
            System.out.println(userName + " has picked odds! The computer will be evens.");
        }else{
            System.out.println("You should have typed \"E\" or \"O\" >:(.");
        }
        System.out.println("------------------------------");

        // play the game
        System.out.print("How many fingers do you put out? ");
        int userFingers = entrada.nextInt();
        Random randNum = new Random();
        int compFingers = randNum.nextInt(6);
        System.out.println("The computer puts out " + compFingers + " \"fingers\".");
        System.out.println("------------------------------");

        // pick a winner
        int suma = userFingers + compFingers;
        System.out.println(userFingers + " + " + compFingers + " = " + suma);
        boolean oddOrEven = suma % 2 == 0;          // if true, it's an even
        if(oddOrEven){
            System.out.println(suma + " is... even!");
            if(userChoice.equalsIgnoreCase("e")){
                System.out.println("That means " + userName + " wins! wuuu");
            }else{
                System.out.println("That means the computer wins! wuuu");
            }
        }else{
            System.out.println(suma + " is... odd!");
            if(userChoice.equalsIgnoreCase("o")){
                System.out.println("That means " + userName + " wins! wuuu");
            }else{
                System.out.println("That means the computer wins! wuuu");
            }
        }
        System.out.println("------------------------------");


    }
}
