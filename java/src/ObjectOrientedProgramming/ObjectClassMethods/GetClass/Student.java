package ObjectOrientedProgramming.ObjectClassMethods.GetClass;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);

        // Отримання типу об'єкта за допомогою getClass()
        Class<? extends Student> studentClass = student.getClass();
        System.out.println("Тип об'єкта: " + studentClass.getName());

        // Виведення інформації про студента
        System.out.println("Ім'я: " + student.getName());
        System.out.println("Вік: " + student.getAge());
    }
}

