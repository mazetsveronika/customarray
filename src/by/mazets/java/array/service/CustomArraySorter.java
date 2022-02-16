package by.mazets.java.array.service;

import by.mazets.java.array.entity.CustomArray;

public interface CustomArraySorter {
    void bubbleSort(CustomArray customArray);

    void quickSort(CustomArray customArray);

    void quickSort(int[] array, int low, int high);

    void selectionSort(CustomArray customArray);
}
