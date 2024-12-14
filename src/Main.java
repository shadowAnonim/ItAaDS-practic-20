//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Integer[] m = new Integer[] {2, 5, 2, 5, 7, 3, 8, 3};
        MinMax<Integer> minmax = new MinMax<Integer>(m);
        System.out.println("Max: " + minmax.getMax());
        System.out.println("Min: " + minmax.getMin());
        short a = 1;
        float b = 1.1f;
        System.out.println(Calculator.add(a, b));
        System.out.println(Calculator.subtract(a, b));
        System.out.println(Calculator.multiply(a, b));
        System.out.println(Calculator.divide(a, b));
    }
}