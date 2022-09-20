package com.lirik

class ConditionRunner {

    static void main(String[] args) {

        /**
         * В JAVA в if помещается какое-то условие (т.е. boolean)
         * В Groovy мы можем помещать в if просто значение:
         * boolean              is true
         * Collection/Map       is not empty
         * Matcher              has match     это мы говорим о регулярных выражениях
         * Number/Char          !=0
         * reference            !=0
         */

        println("Так мы пишем в JAVA")
        int x = 10
        if (x > 0) {
            println(x)
        }

        println("Так мы пишем в Groovy")
        int y = 5    // если y будет равен 0, то на консоль ничего не напечатается
        if (y) {
            println(y)
        } else {
            println("в условии не 0")
        }
    }
}
