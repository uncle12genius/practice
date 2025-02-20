import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s! How old are you? ", name);
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (age > 20) {
            System.out.println("It is not a perfect age for practicing programming.");
        } else {
            System.out.println("It is a perfect age to start programming.");
        }

        System.out.println("Which language do you prefer for programming?");
        System.out.println("A. Python\nB. Java\nC. Javascript\nD. Html");
        System.out.print("Enter your choice (A-D): ");
        String program = scanner.nextLine().trim().toUpperCase();

        if (program.length() > 0) {
            char choice = program.charAt(0);
            switch (choice) {
                case 'A':
                    System.out.println("Python is excellent for beginners and data science!");
                    break;
                case 'B':
                    System.out.println("Java is powerful for enterprise applications!");
                    break;
                case 'C':
                    System.out.println("JavaScript is essential for web development!");
                    break;
                case 'D':
                    System.out.println("HTML is the backbone of web content!");
                    break;
                default:
                    System.out.println("Invalid selection. Try choosing between A-D.");
            }
        } else {
            System.out.println("No input provided.");
        }

        scanner.close();
    }
}