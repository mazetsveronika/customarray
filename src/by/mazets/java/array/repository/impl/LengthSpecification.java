package by.mazets.java.array.repository.impl;
import by.mazets.java.array.entity.CustomArray;
import by.mazets.java.array.repository.Specification;

public class LengthSpecification implements Specification {

    private int length;

    public LengthSpecification(int length) {
        this.length = length;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        return customArray.getLength() == length;
    }
}
