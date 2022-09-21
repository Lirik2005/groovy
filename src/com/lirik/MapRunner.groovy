package com.lirik

class MapRunner {

    static void main(String[] args) {

        def map = ["one": 1, "two": 2, "three": 3]  // таким образом объявляется map (ключ:значение)

        println("Так мы обращаемся к map")
        map.get("one")  // получаем элемент по ключу "one"
        map["one"] // получаем элемент по ключу "one"
        map."one" // получаем элемент по ключу "one"
        map.one // получаем элемент по ключу "one"
        map.get("qwerty", 10) // получаем элемент по ключу "qwerty". Если такого ключа нет, то получаем по дефолту 10

        println("Так мы добавляем в map")
        map.four = 111
        println(map)
    }
}
