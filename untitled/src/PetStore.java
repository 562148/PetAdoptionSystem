import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Manages the collection of pets in the store.
 */
public class PetStore {
    private ArrayList<Pet> pets;

    /**
     * Constructs an empty PetStore.
     */
    public PetStore() {
        pets = new ArrayList<>();
    }

    /**
     * Adds a pet to the store.
     * @param pet Pet to add.
     */
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    /**
     * Displays all pets that are not adopted.
     */
    public void showAvailablePets() {
        System.out.println("\nAvailable Pets:");
        int count = 1;
        // Loop through pets list and print only those not adopted
        for (Pet pet : pets) {
            if (!pet.isAdopted()) {
                System.out.println(count + ". " + pet.toString());
            }
            count++;
        }
    }

    /**
     * Allows a user to adopt a pet by index.
     * Writes adopted pet info to a file.
     * @param index Pet number to adopt (1-based index).
     */
    public void adoptPet(int index) {
        if (index >= 1 && index <= pets.size()) {
            Pet pet = pets.get(index - 1);

            // Check if pet is already adopted
            if (!pet.isAdopted()) {
                pet.setAdopted(true);
                System.out.println("You adopted " + pet.getName() + "!");

                // Append adoption info to a file
                try {
                    FileWriter writer = new FileWriter("adopted_pets.txt", true);
                    writer.write(pet.getName() + " the " + pet.getClass().getSimpleName() + " was adopted.\n");
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error writing to file.");
                }

            } else {
                System.out.println(pet.getName() + " is already adopted.");
            }
        } else {
            System.out.println("Invalid pet number.");
        }
    }
}
