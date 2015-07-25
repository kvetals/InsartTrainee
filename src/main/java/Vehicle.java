

/**
 * Created by Семья on 22.07.2015.
 */
public class Vehicle extends Product{
    private String model;
    private double engineVolume;
    private String body;
    private String transmission;
    private int maxVelocity;

    public Vehicle(){
        super();
        model = "not specified";
        engineVolume = 0;
        body = "not specified";
        transmission = "not specified";
        maxVelocity = 0;
    }

    public Vehicle(String name, String model, double engineVolume, String body, String transmission, int maxVelocity, int price){
        super(name,price);
        this.model = model;
        this.engineVolume = engineVolume;
        this.body = body;
        this.transmission = transmission;
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String toString() {
        return "Vehicle:" + '\n' +
                " Brand: "+ getName()+ '\n' +
                " Model: " + model + '\n' +
                " Engine Volume: " + engineVolume + " liters" + '\n' +
                " Body: " + body + '\n' +
                " Transmission: " + transmission + '\n' +
                " Maximum velocity: " + maxVelocity + " km\\h" + '\n' +
                " Price: $" + getPrice() + '\n';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }
}
