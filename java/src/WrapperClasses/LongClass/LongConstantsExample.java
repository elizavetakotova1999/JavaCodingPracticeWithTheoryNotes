package WrapperClasses.LongClass;

public class LongConstantsExample {
    public static void main(String[] args) {
        long maxValue = Long.MAX_VALUE;
        long minValue = Long.MIN_VALUE;
        int size = Long.SIZE;
        int bytes = Long.BYTES;
        Class<Long> type = Long.TYPE;

        System.out.println("Max Value: " + maxValue);
        System.out.println("Min Value: " + minValue);
        System.out.println("Size in bits: " + size);
        System.out.println("Size in bytes: " + bytes);
        System.out.println("Type: " + type);

    }
}
