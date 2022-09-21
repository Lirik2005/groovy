package com.lirik.categories

import com.lirik.oop.Student

@Category(Student.class)
class DefaultStudentMethods {

    def testStr() {
        println "$age, $firstName"
    }

    static def anotherMethod(Student self, String value) {
        println "$self, args: $value"
    }
}
