package by.mazets.java.array.entity;

import by.mazets.java.array.observer.CustomArrayObservable;
import by.mazets.java.array.observer.CustomArrayObserver;
import by.mazets.java.array.observer.CustomArrayEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractCustomArrayEntity implements CustomArrayObservable {
    static final Logger logger = LogManager.getLogger();
    private CustomArrayObserver arrayObserver;
    private long id;

    public AbstractCustomArrayEntity() {
    }

    public AbstractCustomArrayEntity(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public CustomArrayObserver getCustomArrayObserver() {
        return arrayObserver;
    }

    public void setCustomArrayObserver(CustomArrayObserver arrayObserver) {
        this.arrayObserver = arrayObserver;
    }

    @Override
    public void attach(CustomArrayObserver observer) {
        if(arrayObserver == null){
            arrayObserver = observer;
        } else {
            logger.error("observer already used");
        }
    }

    @Override
    public void detach(CustomArrayObserver observer) {
        if(arrayObserver != null){
            arrayObserver = null;
        } else {
            logger.error("observer not used");
        }
    }

    @Override
    public void notifyObserver() {
        CustomArrayEvent event = new CustomArrayEvent(this);
        if (arrayObserver != null) {
            arrayObserver.replaceStatistic(event);
            arrayObserver.updateAvgValue(event);
            arrayObserver.updateSumValue(event);
            arrayObserver.updateMaxValue(event);
            arrayObserver.updateMinValue(event);
        }
    }
}