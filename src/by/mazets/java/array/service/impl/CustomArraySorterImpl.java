package by.mazets.java.array.service.impl;

import by.mazets.java.array.service.CustomArraySorter;

import by.mazets.java.array.entity.CustomArray;


public abstract class CustomArraySorterImpl implements CustomArraySorter {

    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] customArrayNumbers = customArray.getNumbers();
        int temp;
        for (int i = 1; i < customArrayNumbers.length; i++) {
            for (int j = customArrayNumbers.length; j >= i; j--) {
                if (customArrayNumbers[j - 1] > customArrayNumbers[j]) {
                    temp = customArrayNumbers[j - 1];
                    customArrayNumbers[j - 1] = customArrayNumbers[j];
                    customArrayNumbers[j] = temp;
                }
            }
        }
        customArray.setNumbers(customArrayNumbers);
    }

    @Override
        public void quickSort(int[] array, int low, int high) {
            if (array.length <= 1) ;
            if (low >= high) ;
            int middle = low + (high - low) / 2;
            int pivot = array[middle];
            int i = low, j = high;
            while (i <= j) {
                while (array[i] < pivot) {
                    i++;
                }
                while (array[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
                }
            }
            if (low < j) {
                quickSort(array, low, j);
            }
            if (high > i) {
                quickSort(array, i, high);
            }
        }
    @Override
    public void selectionSort(CustomArray customArray) {

        int[] customArrayNumbers = customArray.getNumbers();
        int pos;
        int temp;
        for (int i = 0; i < customArrayNumbers.length; i++) {

            pos = i;
            for (int j = i + 1; j < customArrayNumbers.length; j++) {
                if (customArrayNumbers[j] < customArrayNumbers[pos]) {
                    pos = j;
                }
            }
            temp = customArrayNumbers[pos];
            customArrayNumbers[pos] = customArrayNumbers[i];
            customArrayNumbers[i] = temp;
        }
        customArray.setNumbers(customArrayNumbers);
    }
}
