package by.mazets.java.array.repository;
import by.mazets.java.array.entity.CustomArray;
import java.util.Comparator;
import java.util.List;

public interface Repository {

    void addArray(CustomArray customArray);

    void addAllArrays(List<? extends CustomArray> customArray);

    void removeArray(CustomArray customArray);

    void removeAllArrays(List<?> customArray);

    CustomArray get(int index);

    CustomArray set(int index, CustomArray customArray);

    List<? super CustomArray> query(Specification specification );

    List sort(Comparator<? super CustomArray> comparator);
}

