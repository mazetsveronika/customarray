package by.mazets.array.service;

import by.mazets.array.entity.CustomArray;

import java.util.OptionalInt;

public interface CustomArrayFinder {

    OptionalInt findMinValue(CustomArray customArray);

    OptionalInt findMaxValue(CustomArray customArray);

    OptionalInt findTheAverageOfTheArray(CustomArray customArray);

    OptionalInt findSumOfArray(CustomArray customArray);

    OptionalInt exchangeNegativeNumbersToZero(CustomArray customArray);

    OptionalInt findNumberOfNegativeElements(CustomArray customArray, int findNumberOfNegativeElements);
}
