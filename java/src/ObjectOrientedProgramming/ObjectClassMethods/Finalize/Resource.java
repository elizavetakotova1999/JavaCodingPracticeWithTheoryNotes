package ObjectOrientedProgramming.ObjectClassMethods.Finalize;

public class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    public void doSomething() {
        System.out.println("Щось робимо з " + name);
    }

    @Override
    //Не зважаючи на підкреслення червоним(метод є deprecated/застарілим), код успішно виконається...
    protected void finalize() throws Throwable {
        try {
            System.out.println("Знищуємо екземпляр класу Resource: " + name);
            // Виконання додаткових дій перед знищенням об'єкта
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        Resource obj1 = new Resource("Object 1");
        obj1.doSomething();

        Resource obj2 = new Resource("Object 2");
        obj2.doSomething();

        // Посилання об'єктів до збирача сміття
        obj1 = null;
        obj2 = null;

        // Очікування виклику методу finalize()
        System.gc();
    }
}


