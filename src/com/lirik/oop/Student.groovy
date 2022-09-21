package com.lirik.oop

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString()
@TupleConstructor
class Student {

    /**
     * Геттеры и сеттеры создаются по умолчанию. Конструктор тоже можно не создавать.
     * Чтобы сделать toString() достаточно поставить над классом аннотацию @ToString() (аналогично как в Lombok)
     * Чтобы сделать конструктор со всеми параметрами достаточно поставить над классом аннотацию @TupleConstructor
     */

    String firstName
    String lastName
    Integer age
}
