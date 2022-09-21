package com.lirik.closure

import com.lirik.oop.Student

class Closure2Runner {

    static void main(String[] args) {

        Closure closure = {
            firstName = "Sveta"
        }
        println closure.thisObject
        println closure.owner
        println closure.delegate

        def student = new Student("Ivan", "Ivanov", 29)
        println(student)
    }
}
