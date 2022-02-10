package by.mazets.array.service.implementation;

import by.mazets.array.service.CustomArraySorter;

import by.mazets.array.entity.CustomArray;


public abstract class CustomArraySorterImpl implements CustomArraySorter {

    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] tempArray = customArray.getArray();
        int temp;
        for (int i = 1; i < tempArray.length; i++) {
            for (int j = tempArray.length; j >= i; j--) {
                if (tempArray[j - 1] > tempArray[j]) {
                    temp = tempArray[j - 1];
                    tempArray[j - 1] = tempArray[j];
                    tempArray[j] = temp;
                }
            }
        }
        customArray.setArray(tempArray);
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

        int[] array = customArray.getArray();
        int pos;
        int temp;
        for (int i = 0; i < array.length; i++) {

            pos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[pos]) {
                    pos = j;
                }
            }
            temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;
        }
        customArray.setArray(array);
    }
}
