package com.lirik

import groovy.transform.CompileStatic

import java.sql.Date

/**
 * В Groovy нет примитивных типов данных. Даже если написать int value = 5, то под капотом все будет переписано на Integer value = 5
 * Также появились BigInteger и BigDecimal
 * УчитываяБ что Groovy это динамический язык, то в нем можно указывать динамический тип данных - def (аналогичен var в JAVA)
 * Тип def может использоваться не только как локальная переменная, но и как поле или параметр метода
 */

class Variables {

    def field = "Alex"   // так делать не рекомендуется

    static void main(String[] args) {

        BigInteger bigInteger = 36G

        BigDecimal bigDecimal = 33.3G

        def value = 5

        def bigDecimalValue = 33.3G

        def bigIntegerValue = 33G
    }

    /**
     * Так делать не рекомендуется
     */

    static def testMethod(def param) {
        return param * 2
    }

    /**
     * Аннотация @CompileStatic нужна для того, чтобы видеть ошибки компиляции в runtime. Если у аннотации убрать комментарий, то new
     * Date() загорится с ошибкой, т.к. конструктор должен принимать параметры. Если комментарий у аннотации не убирать, то ошибка
     * появиться только во время выполнения кода
     */

    // @CompileStatic
    static Date returnDate() {
        def date = new Date();
    }
}
