class Engine
{
    private int power;
    private double fuel;

    public Engine(int power,double fuel)
    {
        this.power = power;
        this.fuel =  fuel;
    }
    public void drive(double fuelLoss)
    {
        this.fuel -= fuelLoss;
        if (this.fuel < 0) {
            this.fuel = 0;
        }
    }
    public double getFuel() {
        return fuel;
    }

    public int getPower() {
        return power;
    }
}
public class Vehicle {
    private String type;
    private String model;
    private Engine engine;

    public Vehicle(String type, String model, Engine engine) {
        this.type = type;
        this.model = model;
        this.engine = engine;
    }

    public void drive(double fuelLoss) {
        engine.drive(fuelLoss);
    }

    public double getFuel() {
        return engine.getFuel();
    }

    public String getInfo() {
        return type + " " + model + ", Power: " + engine.getPower() + ", Fuel: " + engine.getFuel();
    }
}
