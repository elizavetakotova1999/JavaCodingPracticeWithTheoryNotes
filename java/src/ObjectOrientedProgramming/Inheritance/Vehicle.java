package ObjectOrientedProgramming.Inheritance;

// Батьківський клас
class Vehicle {
    private String brand;
    private String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void start() {
        System.out.println("Двигун запущено");
    }

    public void stop() {
        System.out.println("Двигун зупинено");
    }

    public void accelerate() {
        System.out.println("Прискорення...");
    }

    public void brake() {
        System.out.println("Гальма...");
    }
}

