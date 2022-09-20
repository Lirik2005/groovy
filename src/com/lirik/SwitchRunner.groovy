package com.lirik

class SwitchRunner {

    static void main(String[] args) {

        int x = 12

        switch (x) {
            case String:
                println(0)
                break
            case 5:
                println(1)
                break
            case ~/\d+/:
                println(2)
                break
            case { x % 5 == 0 }:
                println(3)
                break
            case [1, 2, 3, 5, 9]:
                println(4)
                break
            default:
                println("none")
                break
        }

        if (x in [1, 2, 3, 4, 5, 8, 9, 10]) {
            println(x)
        } else {
            println("wrong")
        }
    }
}
