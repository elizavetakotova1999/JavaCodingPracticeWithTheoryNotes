package WrapperClasses.ByteClass;

public class ByteConstantsExample {

    public static void main(String[] args) {
        // Мінімальне значення типу byte
        byte minValue = Byte.MIN_VALUE;
        System.out.println("Min Value: " + minValue);

        // Максимальне значення типу byte
        byte maxValue = Byte.MAX_VALUE;
        System.out.println("Max Value: " + maxValue);

        // Розмір типу byte в байтах
        int sizeInBytes = Byte.BYTES;
        System.out.println("Size in Bytes: " + sizeInBytes);

        // Розмір типу byte в бітах
        int sizeInBits = Byte.SIZE;
        System.out.println("Size in Bits: " + sizeInBits);

    }
}
