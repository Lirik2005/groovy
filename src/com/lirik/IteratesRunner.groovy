package com.lirik

class IteratesRunner {

    static void main(String[] args) {

        println ([1, 2, 3, 4, 6, 8].any { it % 2 == 0 })
        println ([1, 2, 3, 4, 6, 8].find { it % 2 == 0 })
        println ([1, 2, 3, 4, 6, 8].findAll { it % 2 == 0 })
    }
}
