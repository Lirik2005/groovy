package com.lirik

class RangeRunner {

    static void main(String[] args) {

        def range = 2..8 // тут 8 включено в коллекцию
        def newRange = 2..<8 // тут 8 НЕ включено в коллекцию

        println(range.get(3))
        println(newRange.contains(8))

        range.each {println it}  // выводим на консоль все значения коллекции (обычный итератор)


    }
}
