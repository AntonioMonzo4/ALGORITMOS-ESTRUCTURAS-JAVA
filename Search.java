public interface Search {

    <T extends Comparable<T>> int find(T[] array, T key);

}
