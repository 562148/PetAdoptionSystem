import java.util.Scanner;

/**
 * Runs the Pet Adoption System user interface.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetStore store = new PetStore();

        // Initialize the store with some pets
        store.addPet(new Dog("Buddy", 3, "Labrador", true));
        store.addPet(new Cat("Whiskers", 2, "Siamese", true));
        store.addPet(new Dog("Rex", 4, "German Shepherd", false));
        store.addPet(new Cat("Mittens", 1, "Persian", false));

        // Array of pet care tips (to completr the rubric Array requirement)
        String[] tips = {
                "Give your pet fresh water daily.",
                "Take your dog for walks.",
                "Brush your pet’s fur regularly.",
                "Take them to the vet annually."
        };

        boolean running = true;

        System.out.println("Welcome to the Pet Adoption System!");

        // Main program loop
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. View Available Pets");
            System.out.println("2. Adopt a Pet");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            // Conditional logic handling menu choices
            if (choice == 1) {
                // Show pets available for adoption
                store.showAvailablePets();
            } else if (choice == 2) {
                // Show pets then prompt user to select one to adopt
                store.showAvailablePets();
                System.out.print("Enter the number of the pet you want to adopt: ");
                int petNumber = scanner.nextInt();
                store.adoptPet(petNumber);
            } else if (choice == 3) {
                // Exit option: this showsa pet care tips before closing
                System.out.println("Thank you for visiting the Pet Adoption System!");

                System.out.println("\nPet Care Tips:");
                // Iterate over array of tips
                for (String tip : tips) {
                    System.out.println("- " + tip);
                }

                running = false; // Stops the loop
            } else {
                // Invalid menu option selected
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close(); // Close the scanner resource
    }
}
