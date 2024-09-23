//public class Main {
//    public static void main(String[] args) {
//        Car myCar1 = new Car(125,"Toyota","Toyota");
//        Car myCar2 = new Car(150,"Innova","Innova");
//        Car myCar3 = new Car(200,"lexus","Lexus");
//
//        myCar1.print();
//        myCar2.print();
//        myCar3.print();
//    }
//}

public class Main {
    public static void main(String[] args) {
        // Creating a Car object using the constructor
        CarPrivate car1 = new CarPrivate(1500, "Toyota", "Corolla");

        // Using getters to print the initial values
        System.out.println("Initial Car Details:");
        System.out.println("Manufacturer: " + car1.getManufacturer());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Weight: " + car1.getWeight());

        // Using setters to change the car's values
        car1.setWeight(1600);
        car1.setManufacturer("Honda");
        car1.setModel("Civic");

        // Using getters to print the updated values
        System.out.println("\nUpdated Car Details:");
        System.out.println("Manufacturer: " + car1.getManufacturer());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Weight: " + car1.getWeight());
    }
}


