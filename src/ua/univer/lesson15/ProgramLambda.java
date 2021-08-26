package ua.univer.lesson15;

import java.util.function.BiFunction;

public class ProgramLambda {
    public static void main(String[] args) {
        BiFunction<Double,Double,Double> sum = (x, y) -> x+y;
        BiFunction<Double,Double,Double> multy = (x, y) -> x*y;
        BiFunction<Double,Double,Double> div = (x, y) -> x/y;
        BiFunction<Double,Double,Double> sub = (x, y) -> x-y;

        Object [] opers = {
                sum,
                multy,
                div
        };
        for (var op: opers) {
            BiFunction<Double,Double,Double> o = (BiFunction<Double,Double,Double>)op;
            System.out.println(o.apply(2.0,3.0));
        }
    }
}
