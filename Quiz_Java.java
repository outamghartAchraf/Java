class Quiz_Java{
    import java.util.Scanner;
import java.util.Random;

 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] questions = {
            "What is the main function of a router?",
            "Which part of the computer is considered the brain?",
            "What year was Facebook launched?",
            "Who is known as the father of computer?",
            "What was the first programming language?"
        };
        
        String[][] options = {
            {"1. Storing files", "2. Encryption data", "3. Directing internet traffic", "4. Managing password"},
            {"1. CPU", "2. HARD DRIVE", "3. RAM", "4. GPU"},
            {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
            {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
            {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}
        };
        
        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        System.out.println("*********************");
        System.out.println("JAVA QUIZ GAME");
        System.out.println("______________________");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (1-4): ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your score is: " + score + "/" + questions.length);
    }
}

