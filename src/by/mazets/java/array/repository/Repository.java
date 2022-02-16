package by.mazets.java.array.repository;
import by.mazets.java.array.entity.CustomArray;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public interface Repository {

    void addArray(CustomArray customArray);

    void addAllArrays(Collection<? extends CustomArray> arrayEntities);

    void removeArray(CustomArray customArray);

    void removeAllArrays(Collection<?> arrayEntities);

    CustomArray get(int index);

    CustomArray set(int index, CustomArray customArray);

    List<? super CustomArray> query(Specification specification );

    List sort(Comparator<? super CustomArray> comparator);
}

