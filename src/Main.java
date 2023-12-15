// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        Enclosure mammalEnclosure = new Enclosure(10);
        myZoo.addEnclosure(mammalEnclosure);

        Scanner keyboard = new Scanner(System.in);

        Mammal elephant = new Mammal(1, "Mammal","Dumbo", 10, "Healthy", "hungry"); //哺乳類動物大象
        Mammal tiger = new Mammal(2, "Mammal","Tigger", 5, "Healthy", "hungry"); //哺乳類動物 老虎
        Mammal lion = new Mammal(3, "Mammal","liion", 5, "Healthy", "hungry"); //哺乳類動物 老師
        Mammal ox = new Mammal(4, "Mammal", "oxxon", 5, "unHealthy", "hungry"); //哺乳類動物 老師
        Mammal pig = new Mammal(5, "Mammal","peggy", 4, "sick", "hungry"); //哺乳類動物 老師
        Mammal sheep = new Mammal(6, "Mammal","sheepy", 4, "sick", "hungry"); //哺乳類動物 老師
        Mammal Bats = new Mammal(7, "Mammal", "Bats", 6, "sick", "hungry"); //哺乳類動物 老師

        mammalEnclosure.addAnimal(elephant);
        mammalEnclosure.addAnimal(tiger);
        mammalEnclosure.addAnimal(lion);
        mammalEnclosure.addAnimal(ox);
        mammalEnclosure.addAnimal(pig);
        mammalEnclosure.addAnimal(sheep);
        mammalEnclosure.addAnimal(Bats);

        // Create Staff
        Zookeeper zookeeper1 = new Zookeeper("Alice", 1, 5000);
        myZoo.addStaff(zookeeper1);

        Manager manager1 = new Manager("Dave", 2, 100000);
        myZoo.addStaff(manager1);

        Veterinarian veterinarian1 = new Veterinarian("Joanne", 3, 20000);
        myZoo.addStaff(veterinarian1);

        // Generate Report
//        myZoo.generateReport();
//
//        zookeeper1.displayInfo();
//        manager1.displayInfo();
//        veterinarian1.displayInfo();

        while (true) {
            System.out.println("\nWelcome to the Zoo Management System");
            System.out.println("\nWhat function would you like to use?");
            System.out.print("'add animal' Please input 1\n 'remove animal' Please input 2\n 'list animal' Please input 3\n 'feed animal' Please input 4\n 'add staff' Please input 5\n 'list staff' Please input 6\n 'add enclosure' Please input 7\n 'generate report' Please input 8\n 'Exit' Please input 0\n");

            int choice = Integer.parseInt(keyboard.nextLine());

            if (choice == 0) {
                System.out.println("Exiting the Zoo Management System. Goodbye!\n");
                break;  // 結束迴圈
            } else if (choice == 1) {
                // Check if Enclosure is full
                if (mammalEnclosure.isFull()) {
                    System.out.println("Enclosure is full! Cannot add more animals.\n");
                } else {
                    // Add Animal
                    int id = mammalEnclosure.capacity;
                    while (true) {
                        System.out.println("Enter ID");
                        try {
                            id = Integer.parseInt(keyboard.nextLine());
                            if ((id <= 0) || mammalEnclosure.containsAnimalWithId(id)) {
                                System.out.println("Invalid ID. Please enter a unique positive integer.\n");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid integer.\n");
                        }
                    }
//                    System.out.println("Enter ID");
//                    id = Integer.parseInt(keyboard.nextLine());
                    System.out.println("Enter EnclosureType");
                    String EnclosureType = keyboard.nextLine();

                    System.out.println("Enter Name");
                    String name = keyboard.nextLine();

                    int age = 0;
                    while (true) {
                        System.out.println("Enter age");
                        try {
                            age = Integer.parseInt(keyboard.nextLine());
                            if (age <= 0) {
                                System.out.println("Invalid age. Please enter a positive integer.\n");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid integer for age.\n");
                        }
                    }

                    System.out.println("Enter healthStatus");
                    String healthStatus = keyboard.nextLine();

                    System.out.println("Enter Hunger (full or hungry)");
                    String hunger = "";
                    while (true) {
                        hunger = keyboard.nextLine().toLowerCase();  // 將輸入轉換為小寫，以允許不區分大小寫
                        if (hunger.equals("full") || hunger.equals("hungry")) {
                            break;
                        } else {
                            System.out.println("Invalid input. Please enter either 'full' or 'hungry'.");
                        }
                    }

                    Animal newAnimal = new Animal(id, EnclosureType, name, age, healthStatus, hunger);
                    mammalEnclosure.addAnimal(newAnimal);
                    System.out.println("Add animal successfully!\n");
                    System.out.println("---------------------------------\n");
                }

            } else if (choice == 2) {
                // Remove Animal
                System.out.println("Enter the ID of the animal you want to remove:");
                int removeId = Integer.parseInt(keyboard.nextLine());

                boolean removed = mammalEnclosure.removeAnimalById(removeId);

                if (removed) {
                    System.out.println("Animal with ID " + removeId + " removed successfully.");
                } else {
                    System.out.println("Animal with ID " + removeId + " not found.");
                }
            } else if (choice == 3) {
                // List Animals
                mammalEnclosure.listAnimals();

            } else if (choice == 4) {
                // Feed Animal
                System.out.println("Enter the ID of the animal you want to feed:");
                int feedId = Integer.parseInt(keyboard.nextLine());

                boolean fed = mammalEnclosure.feedAnimalById(feedId);
            } else if (choice == 5) {
                // Add Staff
                System.out.println("Enter staff name:");
                String staffName = keyboard.nextLine();

                System.out.println("Enter staff ID:");
                int staffId = Integer.parseInt(keyboard.nextLine());

                System.out.println("Enter staff salary:");
                float staffSalary = Float.parseFloat(keyboard.nextLine());

                Staff newStaff = new Staff(staffName, staffId, staffSalary);
                myZoo.addStaff(newStaff);
                System.out.println("Add staff successfully!\n");
                System.out.println("---------------------------------\n");

            } else if (choice == 6) {
                // List Staff
                myZoo.listStaff();
            } else if (choice == 7) {
                // Add Enclosure
                // ... (待添加)
            } else if (choice == 8) {
                // Generate Report
                myZoo.generateReport();
            }


            // Create Staff
//        Zookeeper zookeeper1 = new Zookeeper("Alice", 1, 5000);
//        myZoo.addStaff(zookeeper1);
//
//        Manager manager1 = new Manager("Dave", 2, 100000);
//        myZoo.addStaff(manager1);
//
//        Veterinarian veterinarian1 = new Veterinarian("Joanne", 3, 20000);
//        myZoo.addStaff(veterinarian1);
//
//        // Generate Report
//        myZoo.generateReport();
//
//        zookeeper1.displayInfo();
//        manager1.displayInfo();
//        veterinarian1.displayInfo();
        }
    }
}
