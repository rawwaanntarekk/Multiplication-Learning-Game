public class Main {

    static int lowerBound = 1;
    static int upperBound = 10;

    public static int generateRandomNumber() {
        return (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }


    public static void displayHomeScreen(){
        System.out.println("Welcome to the Multiplication Learning Game!");
        System.out.println("1. Start Game\n2. Help\n3. Show High Score\n4. Exit");

    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}