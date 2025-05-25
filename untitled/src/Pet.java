/**
 * Represents a generic Pet with basic attributes.
 */
public class Pet {
    private String name;
    private int age;
    private String type;
    private boolean adopted;

    /**
     * Constructs a Pet object.
     * @param name The name of the pet.
     * @param age The age of the pet.
     * @param type The type or breed of the pet.
     */
    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.adopted = false;  // Initially, pet is not adopted
    }

    // Getter methods
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getType() { return type; }
    public boolean isAdopted() { return adopted; }

    /**
     * Set the adoption status of the pet.
     * @param adopted true if the pet has been adopted.
     */
    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    /**
     * Returns a string description of the pet.
     * @return String describing the pet.
     */
    public String toString() {
        return name + " (" + type + ", age " + age + ")";
    }
}
