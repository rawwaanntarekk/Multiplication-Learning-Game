import java.util.Scanner;

public class Main {

    static int lowerBound = 1;
    static int upperBound = 10;
    static  Scanner scanner = new Scanner(System.in);

    public static int generateRandomNumber() {
        return (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }

    public static int ValidateOption(){
        try{
            return Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            return -1;
        }

    }

    public static int chooseOption() {
        System.out.print("Please choose an option (1-4): ");
            return ValidateOption();
    }

    public static void processOption(int option){
        switch (option) {
            case 1 ->  /*startGame()*/ System.out.println("Start Game");
            case 2 -> /*showHelp()*/ System.out.println("Help");
            case 3 -> /*showHighScore()*/ System.out.println("Show High Score");
            case 4 -> {
                System.out.println("Exiting the game. Goodbye!");
                System.exit(0);
            }
            default -> {
                System.out.println("Invalid option. Please choose an option (1-4): ");
                displayMenuOptions();
            }
        }
    }

    public static void displayMenuOptions(){
        do {
            System.out.println("1. Start Game\n2. Help\n3. Show High Score\n4. Exit");
            int option = chooseOption();
            processOption(option);
        }while (true);

    }
    public static void displayHomeScreen(){
        System.out.println("Welcome to the Multiplication Learning Game!");
    }

    public static void main(String[] args) {
        displayHomeScreen();
        displayMenuOptions();
    }
}