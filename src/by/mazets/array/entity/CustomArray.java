package by.mazets.array.entity;
import java.util.Arrays;

public class CustomArray {

    private int[] array;

    public CustomArray(int... array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int... array) {
        this.array = array.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomArray)) {
            return false;
        }
        CustomArray that = (CustomArray) obj;
        return Arrays.equals(getArray(), that.getArray());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getArray());
    }

    @Override
    public String toString() {
        return "CustomArray " + Arrays.toString(array);
    }
}