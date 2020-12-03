package Generics.GenericTypes;

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
    OrderedPair<String, String> p2 = new OrderedPair<>("Hello", "World");

    //  This is also allowed, the type can be inferred.
    OrderedPair<String, Integer> p3 = new OrderedPair<String, Integer>("Nine", 9);
    OrderedPair<String, String> p4 = new OrderedPair<String, String>("Data", "Science");

}
