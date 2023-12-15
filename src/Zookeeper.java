public class Zookeeper extends Staff {
    public Zookeeper(String name, int id, float salary) {
        super(name, id, salary);
    }

    public void displayInfo() {
        System.out.println("Zookeeper: " + name + ", ID: " + id );
    }
}