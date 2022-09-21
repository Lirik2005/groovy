package com.lirik.oop

class OopRunner {

    static void main(String[] args) {
        def student = new Student()
        student.firstName = "Ivan"  // под капотом срабатывает метод setFirstName()
        println(student.firstName)   // здесь капотом срабатывает метод getFirstName()
        println student['firstName']   // здесь капотом срабатывает метод getFirstName()
        println student.'firstName'   // здесь капотом срабатывает метод getFirstName()
        println(student.@firstName)  // здесь мы обходим getter и напрямую обращаемся к полю. ТАК ЛУЧШЕ НЕ ДЕЛАТЬ!!!

        def petr = new Student("firstName": "Petr", "lastName": "Petrov", age: 22)  // таким образом реализована работа конструктора
        println (petr)

        /**
         * В таком варианте у класса Student мы должны создать конструктор со всеми полями
         */
        Student oleg = ['Oleg', 'Ivanov', 30] // таким образом мы тоже создали объект класса Student
        println (oleg)
    }
}
