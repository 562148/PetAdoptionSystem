/**
 * Represents a Dog, which is a type of Pet.
 */
public class Dog extends Pet {
    private boolean isTrained;

    /**
     * Constructs a Dog object.
     * @param name Dog's name.
     * @param age Dog's age.
     * @param breed Dog's breed.
     * @param isTrained Whether the dog is trained.
     */
    public Dog(String name, int age, String breed, boolean isTrained) {
        super(name, age, breed);
        this.isTrained = isTrained;
    }

    /**
     * Returns if the dog is trained.
     * @return true if trained.
     */
    public boolean isTrained() {
        return isTrained;
    }

    /**
     * Returns string describing the dog.
     */
    @Override
    public String toString() {
        return super.toString() + " - Trained: " + (isTrained ? "Yes" : "No");
    }
}
