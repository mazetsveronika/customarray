package by.mazets.java.array.observer;

import by.mazets.java.array.exception.CustomArrayException;

public interface CustomArrayObserver {


    void replaceStatistic(CustomArrayEvent event);

    void updateMinValue(CustomArrayEvent event);

    void updateMaxValue(CustomArrayEvent event);

    void updateAvgValue(CustomArrayEvent event);

    void updateSumValue(CustomArrayEvent event);

}