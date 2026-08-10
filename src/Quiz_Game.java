import java.util.Scanner;
class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int answer;
        System.out.println("===== Java Quiz Game =====");
        // Question 1
        System.out.println("\n1. Which language is used to develop Android apps?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. HTML");
        System.out.println("4. C");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }
        // Question 2
        System.out.println("\n2. Which symbol is used to end a Java statement?");
        System.out.println("1. :");
        System.out.println("2. ;");
        System.out.println("3. .");
        System.out.println("4. ,");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }
        // Question 3
        System.out.println("\n3. Which keyword is used to create a class?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. public");
        System.out.println("4. void");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }
        // Question 4
        System.out.println("\n4. Which method is the starting point of a Java program?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. init()");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 3) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }
        // Question 5
        System.out.println("\n5. Which class is used to take user input?");
        System.out.println("1. Random");
        System.out.println("2. Scanner");
        System.out.println("3. String");
        System.out.println("4. Math");
        System.out.print("Your answer: ");
        answer = input.nextInt();
        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }

        // Final Score
        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        input.close();
    }
}