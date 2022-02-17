package by.mazets.java.array.observer.impl;

import by.mazets.java.array.action.impl.CustomArrayActionImpl;
import by.mazets.java.array.entity.CustomArrayStatistics;
import by.mazets.java.array.entity.Warehouse;
import by.mazets.java.array.exception.CustomArrayException;
import by.mazets.java.array.observer.CustomArrayEvent;
import by.mazets.java.array.observer.CustomArrayObserver;
import by.mazets.java.array.entity.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CustomArrayObserverImpl implements CustomArrayObserver {
     static final Logger logger = LogManager.getLogger();


    public void replaceStatistic(CustomArrayEvent event){
        try {
            CustomArray source = event.getSource();
            long sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            warehouse.clearValue(sourceId);
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
            }
    }


    @Override
    public void updateMinValue(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            long sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            CustomArrayStatistics statistics = warehouse.getById(sourceId);
            CustomArrayActionImpl action = CustomArrayActionImpl.getInstance();
            OptionalInt min = action.getMinValue(source);
            if (min.isPresent()){
                statistics.setMin(min.getAsInt());
            }
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void updateMaxValue(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            long sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            CustomArrayStatistics statistics = warehouse.getById(sourceId);
            CustomArrayActionImpl action = new CustomArrayActionImpl();
            OptionalInt max = action.getMaxValue(source);
            if (max.isPresent()){
                statistics.setMax(max.getAsInt());
            }
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void updateAvgValue(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            long sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            CustomArrayStatistics statistics = warehouse.getById(sourceId);
            CustomArrayActionImpl action = new CustomArrayActionImpl();
            OptionalDouble avg = action.getAvgValue(source);
            if (avg.isPresent()){
                statistics.setAvg(avg.getAsDouble());
            }
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
        }
    }

    @Override
    public void updateSumValue(CustomArrayEvent event) {
        try {
            CustomArray source = event.getSource();
            long sourceId = source.getId();
            Warehouse warehouse = Warehouse.getInstance();
            CustomArrayStatistics statistics = warehouse.getById(sourceId);
            CustomArrayActionImpl action = new CustomArrayActionImpl();
            statistics.setSum(action.getSummary(source));
        } catch (CustomArrayException e) {
            logger.error(e.getMessage());
        }
    }
}
