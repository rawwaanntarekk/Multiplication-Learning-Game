import java.util.Scanner;

public class Main {

    static int lowerBound = 1;
    static int upperBound = 10;
    static int difficulty = 1;
    static int score = 0;
    static int highestScore = 0;



    static int successiveCorrectAnswers;
    static int successiveWrongAnswers;
    static  Scanner scanner = new Scanner(System.in);

    public static int generateRandomNumber() {
        return (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }

    public static int validateOption(){
        try{
            return Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            return -1;
        }

    }

    public static int chooseOption() {
        System.out.print("Please choose an option (1-4): ");
            return validateOption();
    }
    public static void showHelp() {
    System.out.println("Game Instructions:");
    System.out.println("1. The game will present 20 multiplication questions.");
    System.out.println("2. Answer correctly to increase your score.");
    System.out.println("3. After 3 correct answers, the difficulty increases.");
    System.out.println("4. 3 successive wrong answers will result in Game Over.");
    System.out.println("5. Try to achieve the highest score!");
}

public static void showHighScore() {
    System.out.println("Highest Score: " + highestScore);
}


    public static void processOption(int option){
        switch (option) {
            case 1 ->  startGame();
            case 2 -> showHelp();
            case 3 -> showHighScore();
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


    // TODO: if name is required in the future, make this method return a string and return the name
    public static void inputName(){
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

    }
    public static void initializeGameVariables(){
        successiveCorrectAnswers = 0;
        successiveWrongAnswers = 0;
        score = 0;
        difficulty = 1;
        lowerBound = 1;
        upperBound = 10;
    }

    public static void startGame(){
        inputName();
        initializeGameVariables();
        for (int i = 0; i < 20; i++) {
            if (!askQuestion()) {
                System.out.println("Please ask your teacher for extra help.");
                break;
            }
        }
       finalizeGame();

    }
    public static boolean askQuestion() {
        int num1 = generateRandomNumber();
        int num2 = generateRandomNumber();

        System.out.println("What is " + num1 + " * " + num2 + "?");
        int userAnswer = validateOption();

        int correctAnswer = num1 * num2;

        if (userAnswer == correctAnswer) {
            return !handleCorrectAnswer();
        } else {
            return !handleWrongAnswer();
        }
    }

    private static boolean handleWrongAnswer() {
        successiveWrongAnswers++;
        successiveCorrectAnswers = 0;
        score -= 5;
        System.out.println("Wrong answer!");

        if (successiveWrongAnswers == 3) {
            System.out.println("Game over. You've made 3 successive wrong answers.");
            return true;
        }
        return false;
    }

    private static boolean handleCorrectAnswer() {
        successiveCorrectAnswers++;
        successiveWrongAnswers = 0;
        score += 10;
        System.out.println("Correct!");

        if (successiveCorrectAnswers == 3) {
            if (difficulty == 3) {
                System.out.println("You answered 3 correct at level 3! You won the game!");
                return true;
            } else {
                increaseDifficulty();
            }
        }
        return false;
    }

    public static void increaseDifficulty() {
        difficulty++;
        successiveCorrectAnswers = 0;
        lowerBound *= 2;
        upperBound *= 2;
        System.out.println("Difficulty increased to level " + difficulty + ". Numbers are now larger.");
    }
     public static void finalizeGame() {
        score = score < 0 ? 0 : score;
        System.out.println("Final Score: " + score);
        if (score > highestScore) {
            highestScore = score;
            System.out.println("Congratulations! You set a new high score!");
        }
        showFeedback();
        System.out.println("High Score: " + highestScore);
    }

    public static void showFeedback() {
        if (score >= 150) {
            System.out.println("Excellent performance! You're a multiplication master!");
        } else if (score >= 100) {
            System.out.println("Good job! Keep practicing and you'll improve even more!");
        } else if (score >= 50) {
            System.out.println("Not bad, but you can do better!");
        } else {
            System.out.println("You need more practice. Don't give up!");
        }
    }
    public static void main(String[] args) {
        displayHomeScreen();
        displayMenuOptions();
    }
}
