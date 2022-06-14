package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//        Box деген generic класс тузунуз.
//        Ичинде Box деген объектти кайтарган статический generic метод болсун.
public class Box<T> {
    private T varA;
    private T varB;


    public static <T> void genericMethod(T varA, T varB) {
        System.out.println(varA);
        System.out.println(varB);
    }

    @Override
    public String toString() {
        return "Box - " +
                "varA is " + varA +
                ", varB is " + varB +
                ".";
    }
}
