/**
 * Represents a Cat, which is a type of Pet.
 */
public class Cat extends Pet {
    private boolean isIndoor;

    /**
     * Constructs a Cat object.
     * @param name Cat's name.
     * @param age Cat's age.
     * @param breed Cat's breed.
     * @param isIndoor Whether the cat is an indoor cat.
     */
    public Cat(String name, int age, String breed, boolean isIndoor) {
        super(name, age, breed);
        this.isIndoor = isIndoor;
    }

    /**
     * Returns if the cat is indoor.
     * @return true if indoor.
     */
    public boolean isIndoor() {
        return isIndoor;
    }

    /**
     * Returns string describing the cat.
     */
    @Override
    public String toString() {
        return super.toString() + " - Indoor: " + (isIndoor ? "Yes" : "No");
    }
}
