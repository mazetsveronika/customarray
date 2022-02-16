package by.mazets.java.array.repository.impl;
import by.mazets.java.array.repository.Specification;
import by.mazets.java.array.entity.CustomArray;
import by.mazets.java.array.action.impl.CustomArrayActionImpl;

public class PositiveSpecification implements Specification {

    private int numberOfPositiveElements;

    public PositiveSpecification(int numberOfPositiveElements) {
        this.numberOfPositiveElements = numberOfPositiveElements;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        CustomArrayActionImpl action = new CustomArrayActionImpl();
        return action.getNumberOfPlusElements(customArray) < numberOfPositiveElements;
    }
}
