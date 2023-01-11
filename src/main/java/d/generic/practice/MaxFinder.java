package d.generic.practice;

public class MaxFinder {

    public static void main(String[] args) {
        MaxFinder mx = new MaxFinder();
        mx.testGetMax();
        System.out.println("-----------------------------------");
        mx.testGetMin();
    }

    public void testGetMax() {
        System.out.println(getMax(1, 2, 3));
        System.out.println(getMax(3, 2, 1));
        System.out.println(getMax(2, 1, 3));
        System.out.println(getMax("a", "b", "c"));
        System.out.println(getMax("b", "c", "a"));
        System.out.println(getMax("c", "a", "b"));
    }

    public void testGetMin() {
        System.out.println(getMin(1, 2, 3));
        System.out.println(getMin(3, 2, 1));
        System.out.println(getMin(2, 1, 3));
        System.out.println(getMin("a", "b", "c"));
        System.out.println(getMin("b", "c", "a"));
        System.out.println(getMin("c", "a", "b"));
    }


    @SafeVarargs
    public final <T extends Comparable<T>> T getMax(T... a) {
        T maxT = a[0];
        for (T target : a) {
            if (target.compareTo(maxT) > 0)
                maxT = target;
        }
        return maxT;
    }

    @SafeVarargs
    public final <T extends Comparable<T>> T getMin(T... a) {
        T maxT = a[0];
        for (T target : a) {
            if (target.compareTo(maxT) < 0)
                maxT = target;
        }
        return maxT;
    }
}
