package com.lirik

import groovy.transform.PackageScope

/**
 * Модификаторы доступа у классов и методом по умолчанию отсутствуют, т.к. в Groovy они по умолчанию public!!!
 * Чтобы установить модификатор доступа packagePrivate илиБ как его еще называют, default достаточно поставить над классом или методом
 * аннотацию @PackageScope!!!!
 * Если у поля не стоит модификатор доступа, то по умолчанию он PRIVATE!!!
 */

@PackageScope
class HelloWorld {

    /**
     * Знак ";" в конце можно не ставить!!! В языке Groovy они не обязательны!!!
     * Также для методов можно не указывать круглые скобки и писать как в примере с методом println
     */

    Integer value  //данная переменная по умолчанию PRIVATE!!!

    /**
     * Данная аннотация делает аннотированный метод packagePrivate или default
     */

    //   @PackageScope
    static void main(String[] args) {
        println("Hello world with brackets")    //можно со скобками
        println "Hello world without brackets"  //можно и без скобок
    }
}
