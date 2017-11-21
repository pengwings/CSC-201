//Created by Brian Yu on 10/22/2017
public class ElectronicEquipment {
    public static void main(String[] args){
        Phone iphone = new Phone("phone", 5.22, 800.00,  14, "Apple", "T-Mobile");
        iphone.printPhone();
        Laptop asus = new Laptop("laptop", 83.2, 499.99, 9, "Asus", 15.6);
        asus.printLaptop();
    }
}

class TypeOfElectronicEquipment {
    public String type;
    public double weight;
    public double cost;
    public int powerUsage;
    public String manufacturer;

    public TypeOfElectronicEquipment(){
    }

    public TypeOfElectronicEquipment(String type, double weight, double cost, int powerUsage, String manufacturer) {
        this.type = type;
        this.weight = weight;
        this.cost = cost;
        this.powerUsage = powerUsage;
        this.manufacturer = manufacturer;
    }

}

class Phone extends TypeOfElectronicEquipment {
    public String carrier;

    public Phone(String type, double weight, double cost, int powerUsage, String manufacturer, String carrier) {
        this.type = type;
        this.weight = weight;
        this.cost = cost;
        this.powerUsage = powerUsage;
        this.manufacturer = manufacturer;
        this.carrier = carrier;
    }

    public void printPhone(){
        System.out.println("This " + manufacturer + " " + type + " weighs " + weight + " oz and costs $" + cost + " and its battery lasts for " + powerUsage + " hours and is on " + carrier + ".");
    }
}

class Laptop extends TypeOfElectronicEquipment {
    public double screenSize;

    public Laptop(String type, double weight, double cost, int powerUsage, String manufacturer, double screenSize) {
        this.type = type;
        this.weight = weight;
        this.cost = cost;
        this.powerUsage = powerUsage;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
    }

    public void printLaptop(){
        System.out.println("This " + manufacturer + " " + type + " weighs " + weight + " oz and costs $" + cost + " and its battery lasts for " + powerUsage + " hours and has a screen size of " + screenSize + " inches.");
    }

}
