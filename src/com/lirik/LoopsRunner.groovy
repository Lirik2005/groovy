package com.lirik

class LoopsRunner {

    static void main(String[] args) {

        println("Так пишем цикл for, если нам надо пройтись от 0 до 4 (4 не включается)")
        for (i in 0..<4) {
            println(i)
        }

        println("Так пишем цикл for, если нам надо пройтись от 0 до 4 (4 включается)")
        for (i in 0..4) {
            println(i)
        }

        println("Так пишем цикл foreach. [1, 2, 3, 4] это коллекция")
        for (i in [1, 2, 3, 4]) {
            println(i)
        }

        println("Так пишем цикл for, используя замыкания или closure. [1, 2, 3, 4] это коллекция. Двигаемся по возрастанию")
        0.upto([1, 2, 3, 4].size()) { value ->
            println(value)
        }

        println("Так пишем цикл for, используя замыкания или closure. [1, 2, 3, 4] это коллекция. Двигаемся по убыванию")
        [1, 2, 3, 4].size().downto(0) { value ->
            println(value)
        }

        println("Так пишем цикл for, используя замыкания или closure. [1, 2, 3, 4] это коллекция. Двигаемся по возрастанию и 4 не включено")
        [1, 2, 3, 4].size().times { value ->
            println(value)
        }

        println("Так пишем цикл for, используя замыкания или closure. [1, 2, 3, 4] это коллекция.Идем от 0 до 5 с шагом в 2. 6 не включено")
        0.step(6, 2) { value ->
            println(value)
        }
    }
}