public class CarPrivate {
    private int weight;
    private String manufacturer;
    private String model;

    // Constructor to initialize the fields
    public CarPrivate(int carWeight, String carManufacturer, String carModel) {
        this.weight = carWeight;
        this.manufacturer = carManufacturer;
        this.model = carModel;
    }

    // Getter and Setter for weight
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Getter and Setter for manufacturer
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
