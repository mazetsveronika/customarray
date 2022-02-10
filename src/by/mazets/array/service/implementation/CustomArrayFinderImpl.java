package by.mazets.array.service.implementation;

import by.mazets.array.service.CustomArrayFinder;

import by.mazets.array.entity.CustomArray;

import java.util.OptionalInt;

public abstract class CustomArrayFinderImpl implements CustomArrayFinder {


    @Override
    public OptionalInt findMinValue(CustomArray customArray) {
        int[] array = customArray.getArray();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        return OptionalInt.of(min);
    }

        @Override
        public OptionalInt findMaxValue (CustomArray customArray){
            int[] array = customArray.getArray();
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return OptionalInt.of(max);
        }

        @Override
        public OptionalInt findTheAverageOfTheArray (CustomArray customArray){
            int[] array = customArray.getArray();
            int sum = 0;
            for (int i : array) {
                sum = sum + i;
            }
            return OptionalInt.of(sum / array.length);
        }


        @Override
        public OptionalInt exchangeNegativeNumbersToZero (CustomArray customArray) {
            int[] array = customArray.getArray();
            if (array.length == 0) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        array[i] = 0;
                    }
                }

            }
                return OptionalInt.empty();
        }

            @Override
            public OptionalInt findNumberOfNegativeElements(CustomArray customArray, int findNumberOfNegativeElements){
                int countOfNegativeElement = 0;
                int[] array = customArray.getArray();
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        countOfNegativeElement++;
                    }
                }
                return OptionalInt.of(findNumberOfNegativeElements);
            }
        }


