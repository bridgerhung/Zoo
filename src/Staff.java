//員工資料，名字、id、薪水
public class Staff {
    String name;
    int id;
    float salary;
    public Staff(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Staff: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
