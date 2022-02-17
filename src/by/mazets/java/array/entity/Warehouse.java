package by.mazets.java.array.entity;

import by.mazets.java.array.exception.CustomArrayException;
import by.mazets.java.array.reader.impl.CustomArrayReaderImpl;
import by.mazets.java.array.reader.CustomArrayReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    static final Logger logger = LogManager.getLogger();
    private static Warehouse instance;
    private final Map<Long, CustomArrayStatistics> mapStatistics;


    public Warehouse() {
        this.mapStatistics = new HashMap<>();
    }

    public static Warehouse getInstance(){
        if(instance == null){
            instance = new Warehouse();
        }
        return instance;
    }

    public CustomArrayStatistics getById(long arrayId) throws CustomArrayException {
        if (mapStatistics.containsKey(arrayId)) {
            CustomArrayStatistics statistics = mapStatistics.get(arrayId);
            return statistics;
        } else {
            logger.error("element with id(" + arrayId + ") not found");
            throw new CustomArrayException("element with id(" + arrayId + ") not found");
        }
    }

    public CustomArrayStatistics putById(Long arrayId, CustomArrayStatistics statistics) {
        return mapStatistics.put(arrayId, statistics);
    }

    public CustomArrayStatistics removeById(long arrayId) throws CustomArrayException{
        if (mapStatistics.containsKey(arrayId)) {
            return mapStatistics.remove(arrayId);
        } else {
            logger.error("element with id(" + arrayId + ") not found");
            throw new CustomArrayException("element with id(" + arrayId + ") not found");
        }
    }

    public CustomArrayStatistics clearValue(long arrayId) throws CustomArrayException {
        if(mapStatistics.containsKey(arrayId)){
            return mapStatistics.replace(arrayId, new CustomArrayStatistics());
        } else {
            logger.error("element with id(" + arrayId + ") not found");
            throw new CustomArrayException("element with id(" + arrayId + ") not found");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Warehouse{");
        sb.append("mapStatistics=").append(mapStatistics);
        sb.append('}');
        return sb.toString();
    }
}
