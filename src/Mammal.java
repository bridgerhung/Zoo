//繼承自動物的哺乳類，他是繼承自動物 - Animal
public class Mammal extends Animal {
    public Mammal(int id , String EnclosureType , String name, int age, String healthStatus , String hunger) {
        super(id, EnclosureType, name, age, healthStatus, hunger);
    }
}