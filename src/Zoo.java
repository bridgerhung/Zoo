import java.util.ArrayList;

public class Zoo {
    ArrayList<Enclosure> enclosures = new ArrayList<>(); // 園區
    ArrayList<Staff> staff = new ArrayList<>(); // 員工

    public void addEnclosure(Enclosure enclosure) {
        enclosures.add(enclosure);
        System.out.println("Add enclosure successfully!");
    }

    public void addStaff(Staff newStaff) {
        staff.add(newStaff);
        System.out.println("Add staff successfully!");
    }

    public void listStaff() {
        System.out.println("Staff:");
        for (Staff staffMember : staff) {
            staffMember.displayInfo();
        }
    }

    public void addEnclosure(int capacity, String enclosureType) {
        Enclosure newEnclosure = new Enclosure(capacity, enclosureType);
        enclosures.add(newEnclosure);
        System.out.println("Add enclosure successfully!\n");
        System.out.println("---------------------------------\n");
    }

    public void generateReport() {
        

        System.out.println("Generating report...");

        // 打印所有園區的動物信息
        for (Enclosure enclosure : enclosures) {
            // System.out.println("Enclosure:");
            enclosure.listAnimals();
        }

        // 打印所有員工的信息
        System.out.println("Staff:");
        for (Staff staffMember : staff) {
            staffMember.displayInfo();
        }

        // Get the number of enclosures
        int enclosureCount = enclosures.size();
        System.out.println("Number of enclosures: " + enclosureCount);

        // Print all the enclosures
        System.out.println("Enclosures:");
        for (Enclosure enclosure : enclosures) {
            System.out.println(enclosure.getEnclosureType());
        }
    }
}
