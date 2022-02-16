package by.mazets.java.array.observer;
import by.mazets.java.array.entity.CustomArray;
import by.mazets.java.array.entity.AbstractCustomArrayEntity;

import java.util.EventObject;

public class CustomArrayEvent extends EventObject {

    public CustomArrayEvent(AbstractCustomArrayEntity source) {
        super(source);
    }

    @Override
    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }
}