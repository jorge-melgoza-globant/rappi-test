package main.java.com.globant.rappi.test.test3;

public class Attribute<String, V> {
    private String attributeName;
    private V value;

    public String getAttributeName() {
        return attributeName;
    }

    public V getValue() {
        return value;
    }

    public Attribute(String attributeName, V value) {
        this.attributeName = attributeName;
        this.value = value;
    }
}
