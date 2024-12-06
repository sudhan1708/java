package strategy;
/*

Strategy design pattern is used when multiple child classes are having
duplicate methods.

We can create an interface for such cases to avoid redundancy

*/

public interface DriveStrategy {
    void drive();
}
