import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] RPS = {"r","p","s"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rock Paper Scissors");
        String computersChoice;
        String myChoice;
        while(true){
            System.out.println();
            System.out.println("Make your choice: r/p/s\nPress e to exit");
            myChoice = scanner.nextLine();
            computersChoice = RPS[random.nextInt(RPS.length)];

            if (myChoice.equals("r") || myChoice.equals("p") || myChoice.equals("s")) {
                System.out.println("Computer played: " + computersChoice);
                if (myChoice.equals(computersChoice)) {
                    System.out.println("It's a Tie!");
                } else if (myChoice.equals("r")) {
                    if (computersChoice.equals("p")) {
                        System.out.println("You Lose!");
                    } else {
                        System.out.println("You Win!");
                    }
                } else if (myChoice.equals("p")) {
                    if (computersChoice.equals("s")) {
                        System.out.println("You Lose!");
                    } else {
                        System.out.println("You Win!");
                    }
                } else if (myChoice.equals("s")) {
                    if (computersChoice.equals("r")) {
                        System.out.println("You Lose!");
                    } else {
                        System.out.println("You Win!");
                    }
                }
            } else if(myChoice.equals("e")) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

    }
}