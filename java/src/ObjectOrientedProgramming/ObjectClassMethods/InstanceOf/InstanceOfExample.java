package ObjectOrientedProgramming.ObjectClassMethods.InstanceOf;

public class InstanceOfExample {
    public static void main(String[] args) {
        Object obj1 = new String("Hello");
        Object obj2 = new Integer(10);
        Object obj3 = new Double(3.14);

        checkObjectType(obj1);
        checkObjectType(obj2);
        checkObjectType(obj3);
    }

    public static void checkObjectType(Object obj) {
        if (obj instanceof String) {
            System.out.println("Об'єкт є рядком");
            String str = (String) obj;
            System.out.println("Довжина рядка: " + str.length());
        } else if (obj instanceof Integer) {
            System.out.println("Об'єкт є цілим числом");
            Integer num = (Integer) obj;
            System.out.println("Значення числа: " + num.intValue());
        } else if (obj instanceof Double) {
            System.out.println("Об'єкт є дійсним числом");
            Double num = (Double) obj;
            System.out.println("Значення числа: " + num.doubleValue());
        } else {
            System.out.println("Тип об'єкта не відомий");
        }
    }
}
