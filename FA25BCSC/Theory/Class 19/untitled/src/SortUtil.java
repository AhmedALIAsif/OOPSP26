import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortUtil {

    // Generic method for natural sorting
    public static <T extends Comparable<? super T>> void sortNaturally(List<T> list) {
        Collections.sort(list);
    }

    // Generic method for sorting using Comparator
    public static <T> void sortUsingComparator(
            List<T> list,
            Comparator<? super T> comparator
    ) {
        list.sort(comparator);
    }


}
