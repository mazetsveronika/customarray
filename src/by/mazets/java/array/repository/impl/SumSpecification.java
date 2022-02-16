package by.mazets.java.array.repository.impl;
import by.mazets.java.array.repository.Specification;
import by.mazets.java.array.entity.CustomArray;
import by.mazets.java.array.action.impl.CustomArrayActionImpl;
import by.mazets.java.array.action.CustomArrayAction;

public class SumSpecification implements Specification {

    private int sum;

    public SumSpecification(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        CustomArrayActionImpl action = new CustomArrayActionImpl();
        return action.getSummary(customArray) > sum;
    }
}