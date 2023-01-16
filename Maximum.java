package com.genericsmaximum;

public class Maximum<E extends Comparable> {
    public static <E extends Comparable> E testMaximum(E... values) {
        E max = values[0];
        for( E element : values){
            if(element.compareTo(max)>0){
                max = element;
            }
        }
        System.out.println(max);
        return max;
    }
}