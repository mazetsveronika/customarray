package by.mazets.java.array.repository.impl;

import by.mazets.java.array.repository.Repository;
import by.mazets.java.array.repository.Specification;
import by.mazets.java.array.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public class CustomArrayRepositoryImpl implements Repository {
    static final Logger logger = LogManager.getLogger();
    private static CustomArrayRepositoryImpl instance;
    private List<CustomArray> arrays;

    public CustomArrayRepositoryImpl() {
        arrays = new ArrayList<>();
    }

    public static CustomArrayRepositoryImpl getInstance() {
        if (instance == null) {
            instance = new CustomArrayRepositoryImpl();
        }
        return instance;
    }

    public List<CustomArray> getCustomArray() {
        return Collections.unmodifiableList(arrays);
    }

    public CustomArray get(int index) {
        return arrays.get(index);
    }

    public int size() {
        return arrays.size();
    }

    @Override
    public void addCustomArray (CustomArray customArray) {
        arrays.add(customArray);
        logger.log(Level.INFO, "New array in repository: " + customArray);
    }

    @Override
    public void addAllCustomArray (List<CustomArray> customArray) {
        arrays.addAll(customArray);
        logger.log(Level.INFO, "New arrays in repository: " + customArray);
    }

    @Override
    public boolean removeCustomArray(CustomArray customArray) {
        return arrays.remove(customArray);
    }

    @Override
    public boolean removeAllCustomArray(List<CustomArray> customArray) {
        return arrays.removeAll(customArray);
    }

    @Override
    public List<? super CustomArray> query(Specification specification) {
        List<CustomArray> result = arrays.stream().filter(specification::specify).collect(Collectors.toList());
        logger.log(Level.INFO, "Query by specification " + specification + ": " + result);
        return result;
    }

    @Override
    public List sort(Comparator<? super CustomArray> comparator) {
        List<CustomArray> result = arrays.stream().sorted(comparator).collect(Collectors.toList());
        logger.log(Level.INFO, "Sorted with comparator " + comparator + ": " + result);
        return result;
    }
}
