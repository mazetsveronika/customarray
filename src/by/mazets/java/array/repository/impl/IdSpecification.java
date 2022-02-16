package by.mazets.java.array.repository.impl;
import by.mazets.java.array.repository.Specification;
import by.mazets.java.array.entity.CustomArray;

public class IdSpecification implements Specification {

    private long id;

    public IdSpecification(long id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        return customArray.getId() == id;
    }
}
