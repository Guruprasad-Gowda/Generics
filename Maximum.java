package com.genericsmaximum;

public class Maximum<E extends Comparable> {
    public static <E extends Comparable> E testMaximum(E... values) {
        E max = values[0];
        for (E element : values) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        toPrint(max, values);
        return max;
    }

    private static <E> void toPrint(E max, E... values) {
        for (E element : values) {
            System.out.print(element + "\t");
        }
        System.out.print("\nmax is " + max + "\n");
    }
}