public abstract class Vehicle {

    private String model;
    private int numberOfWheels;

    protected Vehicle(String model, int numberOfWheels) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
    }

    protected String drivingInstructions(){
        return "Turn the key to start.";
    }

    protected String getModel() {
        return model;
    }

    protected int getNumberOfWheels() {
        return numberOfWheels;
    }

    protected String startEngine() {
        return "Vrrr. Engine is running.";
    }

    protected abstract String boardingInstructions();
}