package com.lirik

class ListRunner {

    static void main(String[] args) {

        println("таким образом мы создаем коллекцию ArrayList")
        def list = [1, 3, 5, 6]

        println("К элементам коллекции можно обращаться способами ниже")
        println(list[2])
        println(list.get(2))

        println("Добавлять элементы коллекции можно способами ниже")

        list += 9    // в конец коллекции добавили элемент 9
        list << 11 << 13 // добавит в конец коллекции сначала 11 и потом еще 13. Можно продолжать эту конструкцию
        list << 7 << 7 << 14 << 22

        println(list)

        println("Удалять элементы коллекции можно способами ниже")
        list -= 7 // Такой записью мы удаляем все цифры 7 из коллекции
        println(list)
        list -= [5, 11] //Такой записью мы удаляем все цифры 5 и 11 из коллекции
        println(list)

        println('Еще методы')
        list.push(999)   // добавляет элемент в начало коллекции
        list.head()    // возвращает головной (первый) элемент коллекции
        list.tail() // возвращает все элементы, кроме первого (головного)
        list.last() // возвращает последний элемент коллекции

    }
}
