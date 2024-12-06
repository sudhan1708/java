package strategy;

public class Bus extends Vehicle{
    public Bus(){
        super(new NormalDriveStrategy());
    }
}
