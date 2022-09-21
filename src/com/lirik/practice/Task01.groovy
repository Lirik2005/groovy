package com.lirik.practice

import com.lirik.oop.Student

/**
 * Добавить метод инициализации "make" для создания объектов любых классов.
 * Метод должен быть проксирован на соответствующий конструктор.
 */

class Task01 {

    static void main(String[] args) {

        Class.metaClass.make = { Object[] values ->
            delegate.metaClass.invokeConstructor(values)
        }

        def hashSet = HashSet.make([1, 2, 3, 4, 4])
        def student = Student.make("Ivan", "Ivanov", 18)
        def anotherStudent = Student.make()

        println(hashSet)
        println(student)
        println(anotherStudent)


    }
}
