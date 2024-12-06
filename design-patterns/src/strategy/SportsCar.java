package strategy;

public class SportsCar extends Vehicle {
  public SportsCar() {
    super(new SportDriveStrategy());
  }
}
