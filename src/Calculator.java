public class Calculator {
    public static  <T1 extends Number, T2 extends Number> Number add(T1 a, T2 b)
    {
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class))
            return a.doubleValue() + b.doubleValue();
        else if (a.getClass().equals(Float.class) || b.getClass().equals(Float.class))
            return a.floatValue() + b.floatValue();
        else if (a.getClass().equals(Long.class) || b.getClass().equals(Long.class))
            return a.longValue() + b.longValue();
        else if (a.getClass().equals(Integer.class) || b.getClass().equals(Integer.class))
            return a.intValue() + b.intValue();
        else if (a.getClass().equals(Short.class) || b.getClass().equals(Short.class))
            return a.shortValue() + b.shortValue();
        else
            return a.byteValue() + b.byteValue();
    }

    public static <T1 extends Number, T2 extends Number> Number subtract(T1 a, T2 b)
    {
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class))
            return a.doubleValue() - b.doubleValue();
        else if (a.getClass().equals(Float.class) || b.getClass().equals(Float.class))
            return a.floatValue() - b.floatValue();
        else if (a.getClass().equals(Long.class) || b.getClass().equals(Long.class))
            return a.longValue() - b.longValue();
        else if (a.getClass().equals(Integer.class) || b.getClass().equals(Integer.class))
            return a.intValue() - b.intValue();
        else if (a.getClass().equals(Short.class) || b.getClass().equals(Short.class))
            return a.shortValue() - b.shortValue();
        else
            return a.byteValue() - b.byteValue();
    }

    public static <T1 extends Number, T2 extends Number> Number multiply(T1 a, T2 b)
    {
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class))
            return a.doubleValue() * b.doubleValue();
        else if (a.getClass().equals(Float.class) || b.getClass().equals(Float.class))
            return a.floatValue() * b.floatValue();
        else if (a.getClass().equals(Long.class) || b.getClass().equals(Long.class))
            return a.longValue() * b.longValue();
        else if (a.getClass().equals(Integer.class) || b.getClass().equals(Integer.class))
            return a.intValue() * b.intValue();
        else if (a.getClass().equals(Short.class) || b.getClass().equals(Short.class))
            return a.shortValue() * b.shortValue();
        else
            return a.byteValue() * b.byteValue();
    }

    public static <T1 extends Number, T2 extends Number> Number divide(T1 a, T2 b)
    {
        if (a.getClass().equals(Double.class) || b.getClass().equals(Double.class))
            return a.doubleValue() / b.doubleValue();
        else if (a.getClass().equals(Float.class) || b.getClass().equals(Float.class))
            return a.floatValue() / b.floatValue();
        else if (a.getClass().equals(Long.class) || b.getClass().equals(Long.class))
            return a.longValue() / b.longValue();
        else if (a.getClass().equals(Integer.class) || b.getClass().equals(Integer.class))
            return a.intValue() / b.intValue();
        else if (a.getClass().equals(Short.class) || b.getClass().equals(Short.class))
            return a.shortValue() / b.shortValue();
        else
            return a.byteValue() / b.byteValue();
    }
}
