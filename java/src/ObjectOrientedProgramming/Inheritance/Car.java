package ObjectOrientedProgramming.Inheritance;

// Підклас, що успадковує властивості і методи батьківського класу Vehicle
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String color, int numberOfDoors) {
        super(brand, color);
        this.numberOfDoors = numberOfDoors;
    }

    public void openDoor() {
        System.out.println("Відкриття двері");
    }

    public void closeDoor() {
        System.out.println("Закриття двері");
    }
}
