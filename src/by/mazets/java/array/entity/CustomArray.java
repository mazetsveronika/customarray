package by.mazets.java.array.entity;

import by.mazets.java.array.observer.CustomArrayEvent;
import by.mazets.java.array.observer.CustomArrayObserver;
import by.mazets.java.array.observer.CustomArrayObservable;
import by.mazets.java.array.observer.impl.CustomArrayObserverImpl;
import by.mazets.java.array.entity.AbstractCustomArrayEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArray extends AbstractCustomArrayEntity {
    static final Logger logger = LogManager.getLogger();
    private int[] numbers;

    public CustomArray() {
        super();
    }

    public CustomArray(long id, int[] numbers) {
        super(id);
        this.numbers = numbers.clone();
    }

    public int[] getNumbers() {
        return numbers.clone();
    }

    public void setNumbers(int... numbers) {
        this.numbers = numbers.clone();
        notifyObserver();
    }

    public int getLength(){
        return numbers.length;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray array = (CustomArray) o;
        return Arrays.equals(numbers, array.numbers);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(numbers);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CustomArray{");
        stringBuilder.append("numbers=");
        stringBuilder.append(Arrays.toString(numbers));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }


}

