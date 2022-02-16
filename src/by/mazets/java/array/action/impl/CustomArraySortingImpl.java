package by.mazets.java.array.action.impl;
import by.mazets.java.array.action.CustomArraySorting;
import by.mazets.java.array.entity.CustomArray;
import by.mazets.java.array.generator.IdGeneratorOfCustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArraySortingImpl implements CustomArraySorting {
    private static final Logger logger = LogManager.getLogger();

    private void swap(int[] numbers, int ind1, int ind2) {
        int tmp = numbers[ind1];
        numbers[ind1] = numbers[ind2];
        numbers[ind2] = tmp;
    }

    @Override
    public CustomArray bubbleSort(CustomArray customArray){
        CustomArray sortedCustomArray;
        int[] numbers = customArray.getNumbers();
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[i - 1]) {
                    swap(numbers, i, i-1);
                    needIteration = true;
                }
            }
        }
        sortedCustomArray = new CustomArray(IdGeneratorOfCustomArray.idGenerate(), numbers);
        return sortedCustomArray;
    }

    @Override
    public CustomArray selectionSort(CustomArray customArray){
        CustomArray newCustomArray;
        int[] numbers = customArray.getNumbers();
        for (int i = 0; i < numbers.length; i++) {
            int minInd = i;
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[minInd]) {
                    minInd = j;
                }
            }
            swap(numbers, i, minInd);
        }
        newCustomArray = new CustomArray(IdGeneratorOfCustomArray.idGenerate(), numbers);
        return newCustomArray;
    }

    @Override
    public CustomArray insertionSort(CustomArray customArray){
        CustomArray newCustomArray;
        int[] numbers = customArray.getNumbers();
        for (int left = 0; left < numbers.length; left++) {
            int value = numbers[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < numbers[i]) {
                    numbers[i + 1] = numbers[i];
                } else {
                    break;
                }
            }
            numbers[i + 1] = value;
        }
        newCustomArray = new CustomArray(IdGeneratorOfCustomArray.idGenerate(), numbers);
        return newCustomArray;

    }


}