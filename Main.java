import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        TelephoneDirectory directory = new TelephoneDirectory();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nTelephone Directory Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit Program");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    directory.addContact();
                    break;
                case 2:
                    directory.displayContacts();
                    break;
                case 3:
                    directory.updateContact();
                    break;
                case 4:
                    directory.deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
