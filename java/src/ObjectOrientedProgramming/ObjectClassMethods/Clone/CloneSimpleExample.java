package ObjectOrientedProgramming.ObjectClassMethods.Clone;

public class CloneSimpleExample implements Cloneable {
    private int myField;

    public CloneSimpleExample(int myField) {
        this.myField = myField;
    }

    public int getMyField() {
        return myField;
    }

    public void setMyField(int myField) {
        this.myField = myField;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

