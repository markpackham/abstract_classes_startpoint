public class Motorbike extends Vehicle {

    public Motorbike(String model)
    {
        super(model, 2);
    }

    public final String drivingInstructions()
    {
        return super.drivingInstructions() + " Use handlebars to steer.";

    }

    @Override
    public final String boardingInstructions() {
        return "Just hop on.";
    }
}