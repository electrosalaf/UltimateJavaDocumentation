package Generics.GenericTypes;

/**
 * This is a non-generic class Box that operates on objects of any type
 */
public class Box {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }
    public Object get() {
        return object;
    }
}
