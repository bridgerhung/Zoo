public class Veterinarian extends Staff {
    public Veterinarian(String name, int id, float salary) {
        super(name, id, salary);
    }

    public void displayInfo() {
        System.out.println("Veterinarian: " + name + ", ID: " + id );
    }
}
