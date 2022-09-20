package com.lirik

import java.util.stream.Stream

/**
 * Closure это замыкание
 */

class ClosureRunner {

    static void main(String[] args) {

        println ("Вызов кода, написанного с лямбда-выражением")
        Stream.of(1, 2, 3, 4)
                .map(value -> value + value)
                .forEach(System.out::println)

        println ("Вызов кода, написанного с замыканием")
        Closure closure ={value -> value + value}
        def call = closure.call(5)
        println (call)
        Stream.of(1, 2, 3, 4)
                .map(closure)
                .forEach(System.out::println)
    }
}
