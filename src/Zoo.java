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

    public void generateReport() {
        System.out.println("Generating report...");

        // 打印所有園區的動物信息
        for (Enclosure enclosure : enclosures) {
            System.out.println("Enclosure:");
            enclosure.listAnimals();
        }

        // 打印所有員工的信息
        System.out.println("Staff:");
        for (Staff staffMember : staff) {
            staffMember.displayInfo();
        }
    }
}
