// Demonstrating Abstraction in Java
abstract class Remotee {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete class implementing the abstract methods
class TVRemote extends Remotee {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}

// Main class to demonstrate abstraction
public class Abstraction1 {
    public static void main(String[] args) {
        Remotee remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
