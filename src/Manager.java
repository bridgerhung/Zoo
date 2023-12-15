public class Manager extends Staff {
    public Manager(String name, int id, float salary) {
        super(name, id, salary);
    }

    public void displayInfo() {
        System.out.println("Manager: " + name + ", ID: " + id );
    }
}
