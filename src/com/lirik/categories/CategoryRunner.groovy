package com.lirik.categories

import com.lirik.oop.Student

class CategoryRunner {

    static void main(String[] args) {

        def ivan = new Student(age: 18, firstName: "Ivan")
        use(DefaultStudentMethods.class) {
            ivan.testStr()
            ivan.anotherMethod("Test arg")
        }
    }
}
