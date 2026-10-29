import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeatherService weatherService = new WeatherService();
        Calculator calculator = new Calculator();
        NotesManager notesManager = new NotesManager();

        System.out.println("Welcome to Personal Assistant!");

        while (true) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Check Weather");
            System.out.println("2. Use Calculator");
            System.out.println("3. Take a Note");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            String choice = scanner.nextLine();
            logger.info("User selected menu option: " + choice);

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter city name: ");
                        String city = scanner.nextLine();
                        weatherService.getWeather(city);
                        break;
                    case "2":
                        System.out.print("Enter first number: ");
                        double num1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Enter operation (+, -, *, /): ");
                        String op = scanner.nextLine();
                        System.out.print("Enter second number: ");
                        double num2 = Double.parseDouble(scanner.nextLine());
                        calculator.calculate(num1, num2, op);
                        break;
                    case "3":
                        System.out.print("Enter your note: ");
                        String note = scanner.nextLine();
                        notesManager.saveNote(note);
                        break;
                    case "4":
                        System.out.println("Exiting... Have a great day!");
                        logger.info("Application closed by user.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! Please enter valid numbers.");
                logger.warning("NumberFormatException: User entered text instead of number.");
            } catch (Exception e) {
                System.out.println("Something went wrong. Please try again.");
                logger.severe("Main loop exception: " + e.getMessage());
            }
        }
    }
}