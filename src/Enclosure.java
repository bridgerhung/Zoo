//園區，
import java.util.ArrayList;

public class Enclosure {
    int capacity; //動物園容量
    ArrayList<Animal> animals = new ArrayList<>(); //一個陣列存放動物的屬性

    public Enclosure(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return animals.size() >= capacity;
    }

    public boolean containsAnimalWithId(int searchId) {
        for (Animal animal : animals) {
            if (animal.id == searchId) {
                return true;
            }
        }
        return false;
    }

    //園區是否能負擔動物
    public void addAnimal(Animal animal) {
        if (animals.size() < capacity) { //動物大小
            animals.add(animal);
        } else {
            System.out.println("Enclosure is full!");
        }
    }


    public void listAnimals() {
        for (Animal animal : animals) {
            animal.displayInfo();
        }
    }


    public boolean removeAnimalById(int removeId) {
        for (Animal animal : animals) {
            if (animal.id == removeId) {
                animals.remove(animal);
                return true;
            }
        }
        return false;
    }
    public boolean feedAnimalById(int feedId) {
        for (Animal animal : animals) {
            if (animal.id == feedId) {
                if (animal.hunger.equals("hungry")) {
                    System.out.println("Feeding successful! Animal with ID " + feedId + " is now full.");
                    animal.hunger = "full";
                    return true;
                } else {
                    System.out.println("Animal with ID " + feedId + " is already full.");
                    return false;
                }
            }
        }
        System.out.println("Animal with ID " + feedId + " not found.");
        return false;
    }
}
