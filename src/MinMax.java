public class MinMax<T extends Comparable<T>>
{
    private T[] collection;

    public MinMax(T[] collection) {
        if (collection.length < 1)
            throw new RuntimeException("Empty collection");
        this.collection = collection;
    }

    public T getMax()
    {
        T max = collection[0];
        for (int i = 1; i < collection.length; i++)
            if (max.compareTo(collection[i]) > 0)
                max = collection[i];
        return max;
    }


    public T getMin()
    {
        T min = collection[0];
        for (int i = 1; i < collection.length; i++)
            if (min.compareTo(collection[i]) < 0)
                min = collection[i];
        return min;
    }
}
