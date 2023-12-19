//動物基本資料，這裡輸出基本資料
public class Animal {
     String name;
     String EnclosureType;
     int age;
     int id;
     String healthStatus;
     String hunger;

    public Animal(int id , String EnclosureType,  String name, int age, String healthStatus , String hunger) {
        this.name = name;
        this.EnclosureType = EnclosureType;
        this.age = age;
        this.healthStatus = healthStatus;
        this.id = id;
        this.hunger = hunger;
    }
    public void displayInfo() {
        System.out.println("id: " + id + " , EnclosureType: " + EnclosureType + " , Animal: " + name + " , Age: " + age + " , Health: " +
                healthStatus + " , Hunger : " + hunger );
    }

    public String getEnclosureType() {
        return EnclosureType;
    }

    public void setEnclosureType(String enclosureType) {
        this.EnclosureType = enclosureType;
    }
    

}
