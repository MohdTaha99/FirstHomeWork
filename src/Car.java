public class Car {
    int weight;
    String manufacturer;
    String model;

    public Car(int weight, String manufacturer, String model) {
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void print(){
        System.out.println("Car Details: ");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("-----------------------------");
    }
}
