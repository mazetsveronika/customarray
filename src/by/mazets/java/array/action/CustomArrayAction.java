package by.mazets.java.array.action;

import by.mazets.java.array.entity.CustomArray;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public interface CustomArrayAction {


        OptionalInt getMinValue(CustomArray customArray);

        OptionalInt getMaxValue(CustomArray customArray);

        OptionalDouble getAvgValue(CustomArray customArray);

        int getSummary(CustomArray customArray);

        long getNumberOfPlusElements(CustomArray customArray);

        long getNumberOfMinusElements(CustomArray customArray);

    CustomArray replaceElement(CustomArray customArray, int desiredElement, int newElement);
    }

