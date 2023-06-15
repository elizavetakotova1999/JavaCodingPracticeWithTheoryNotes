package ObjectOrientedProgramming.Inheritance;

// Підклас, що успадковує властивості і методи батьківського класу Vehicle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, String color, boolean hasSidecar) {
        super(brand, color);
        this.hasSidecar = hasSidecar;
    }

    public void lean() {
        System.out.println("Нахилення мотоцикла");
    }
}