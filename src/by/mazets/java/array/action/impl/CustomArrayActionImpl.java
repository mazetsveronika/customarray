package by.mazets.java.array.action.impl;

import by.mazets.java.array.action.CustomArrayAction;
import by.mazets.java.array.entity.CustomArray;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CustomArrayActionImpl implements CustomArrayAction {

    private static CustomArrayActionImpl instance;

    public static CustomArrayActionImpl getInstance(){
        if(instance == null){
            instance = new CustomArrayActionImpl();
        }
        return instance;
    }

    public IntStream convertToIntStream(CustomArray customArray){
        int[] numbers = customArray.getNumbers();
        return Arrays.stream(numbers);
    }

    @Override
    public OptionalInt getMinValue(CustomArray customArray) {
        IntStream minimum = convertToIntStream(customArray);
        return minimum.min();
    }

    @Override
    public OptionalInt getMaxValue(CustomArray customArray) {
        IntStream maximum = convertToIntStream(customArray);
        return maximum.max();
    }

    @Override
    public OptionalDouble getAvgValue(CustomArray customArray) {
        IntStream average = convertToIntStream(customArray);
        return average.average();
    }

    @Override
    public int getSummary(CustomArray customArray) {
        IntStream summary = convertToIntStream(customArray);
        return summary.sum();
    }

    @Override
    public long getNumberOfPlusElements(CustomArray customArray) {
        IntStream plus = convertToIntStream(customArray);
        return plus.filter(i -> (i > 0)).count();
    }

    @Override
    public long getNumberOfMinusElements(CustomArray customArray) {
        IntStream minus = convertToIntStream(customArray);
        return minus.filter(i -> (i < 0)).count();
    }

    @Override
    public CustomArray replaceElement(CustomArray customArray, int desiredElement, int newElement) {
        return null;
    }

}