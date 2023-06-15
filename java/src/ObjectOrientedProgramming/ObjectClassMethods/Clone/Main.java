package ObjectOrientedProgramming.ObjectClassMethods.Clone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CloneSimpleExample originalObj = new CloneSimpleExample(10);
        try {
            CloneSimpleExample cloneObj = (CloneSimpleExample) originalObj.clone();
            System.out.println(cloneObj.getMyField()); // Виводить 10
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("1234567890");
        phoneNumbers.add("9876543210");

        Person person1 = new Person("John Doe", phoneNumbers);

        try {
            Person person2 = (Person) person1.clone();

            // Зміни в клонованому об'єкті не впливають на оригінальний об'єкт
            person2.getPhoneNumbers().add("5555555555");

            System.out.println(person1.getName() + ": " + person1.getPhoneNumbers());
            System.out.println(person2.getName() + ": " + person2.getPhoneNumbers());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
