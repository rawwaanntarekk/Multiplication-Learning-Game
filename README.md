## Multiplication Learning Game ##
 # 1. Introduction
 The Multiplication Learning Game is a console-based educational application designed to
 help users practice multiplication skills. Users are challenged with multiplication questions,
 and their performance is tracked across different difficulty levels. The game adjusts its
 difficulty based on the user's performance and provides feedback on their progress.
 # 2. System Overview
 The game provides the following functionalities:
 Start Game: Begin a new game session where users answer multiplication questions.
 Help: Access instructions and rules for playing the game.
 Show High Score: View the highest score achieved in the game.
 Exit: Close the game application.
 3. Features and Functionality
 # 3.1. Start Game
 Purpose: To initiate a new game session where the user answers multiplication questions.
 Process:
 1. Name Entry: The user is prompted to enter their name.
 2. Question Generation: The game generates multiplication questions based on the current
 difficulty level.
 3. Answer Checking: User responses are checked for correctness.
 4. Scoring: Correct and incorrect answers are tracked.
 5. Difficulty Adjustment: After 3 consecutive correct answers, the difficulty level increases. If the user answers 3 questions wrong in a row, the game ends.
 6. Feedback: The user receives feedback on their performance and the game concludes
 after 20 questions or upon "Game Over."
 

 # 3.2. Help
 Purpose: To provide instructions and guidance on how to play the game. Process:
 1. Game Description: The game explains that it is a multiplication learning tool.
 2. Gameplay Instructions: Users are informed about answering multiplication questions and
 the rules for advancing difficulty levels.

 # 3.3. Show High Score
 Purpose: To display the highest score achieved in the game. Process:
 1. High Score Display: The game shows the current high score based on the best
 performance recorded.

# 3.4. Exit
 Purpose: To close the game application. Process:
 1. Exit Confirmation: The game confirms that the user wants to exit and terminates the
 application.
 4. Error Handling
 Invalid Menu Option: If the user selects an invalid option, they are prompted to choose a
 valid option again.
 Game Over: The game ends if the user gets 3 consecutive wrong answers, and a "Game
 Over" message is displayed.
 5. Code Details
 Random Number Generation: The game uses the <cstdlib> library for std::rand() and
 std::srand() to generate random numbers for question creation.
 Time Seeding: The <ctime> library provides std::time() for seeding the random number
 generator, ensuring that each game session generates unique questions.
# Workflow
 Initialization
 Seed the random number generator.
 Display the home screen with menu options.
 Menu Selection
 User selects an option from the menu.
 Start Game
 Prompt for the player’s name.
 Initialize game variables including successive_correct and successive_wrong.
 For each of the 20 questions:
 Generate a multiplication question based on the current difficulty level.
 Check the user's answer:
 If correct:
 Increment successive_correct.
 Reset successive_wrong.
 Update the score.
 Check if the user has answered 3 questions correctly in a row at the
 3rd difficulty level. If so, display a winning message and end the game.
 If incorrect:
 Increment successive_wrong.
 Reset successive_correct.
 Update the score.
 If the user answers incorrectly 3 times in a row, end the game.
 Check for a difficulty level change:
 If the user answers 3 questions correctly in a row, increase the difficulty
 level and reset successive_correct.
 Game Over
 Display a message if the user has answered 3 questions incorrectly in a row.
 Calculate the final score.
 Provide feedback based on the final score.
 Show the high score.
 Help
 Display game instructions.
 Show High Score
 Display the highest score recorded.
 Exit
 End the program and display a farewell message.
