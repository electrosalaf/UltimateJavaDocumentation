package Generics.GenericTypes;

/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class BoxGenerics<T> {
    //  T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return  t;
    }

    //  Parameterized type
    OrderedPair<String, BoxGenerics<Integer>> p = new OrderedPair<>("Primes", new BoxGenerics<Integer>());
}

