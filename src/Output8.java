import java.util.*;
class Output8
{
    public static double sumOfList(List<? extends Number> list)
    {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }
    public static void main(String[] args)
    {
        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println(sumOfList(ld));
    }
}