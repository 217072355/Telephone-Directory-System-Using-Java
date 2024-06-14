import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneDirectory {
    private ArrayList<DirectoryEntry> directory = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addContact() {
        System.out.println("Enter Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        DirectoryEntry newEntry = new DirectoryEntry(name, phoneNumber, address);
        directory.add(newEntry);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        if (directory.isEmpty()) {
            System.out.println("Directory is empty.");
        } else {
            System.out.println("Contacts in the Directory:");
            for (DirectoryEntry entry : directory) {
                System.out.println(entry);
            }
        }
    }

    public void updateContact() {
        if (directory.isEmpty()) {
            System.out.println("Directory is empty. No contacts to update.");
            return;
        }

        System.out.println("Enter the Name of the contact to update:");
        String name = scanner.nextLine();

        DirectoryEntry foundEntry = null;
        for (DirectoryEntry entry : directory) {
            if (entry.getName().equalsIgnoreCase(name)) {
                foundEntry = entry;
                break;
            }
        }

        if (foundEntry != null) {
            System.out.println("Enter new Phone Number:");
            String newPhoneNumber = scanner.nextLine();
            System.out.println("Enter new Address:");
            String newAddress = scanner.nextLine();

            foundEntry.setPhoneNumber(newPhoneNumber);
            foundEntry.setAddress(newAddress);
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact() {
        if (directory.isEmpty()) {
            System.out.println("Directory is empty. No contacts to delete.");
            return;
        }

        System.out.println("Enter the Name of the contact to delete:");
        String name = scanner.nextLine();

        DirectoryEntry foundEntry = null;
        for (DirectoryEntry entry : directory) {
            if (entry.getName().equalsIgnoreCase(name)) {
                foundEntry = entry;
                break;
            }
        }

        if (foundEntry != null) {
            directory.remove(foundEntry);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void exitProgram() {
        System.out.println("Exiting program. Goodbye!");
        System.exit(0);
    }

    
}

