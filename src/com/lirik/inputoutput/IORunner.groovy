package com.lirik.inputoutput

class IORunner {

    static void main(String[] args) {

        def file = new File(".gitignore")
        println file.text

        file.each { line -> println(line) }
        file.withInputStream { def allText = new String(it.readAllBytes())
        println(allText)
        }

        def newFile = new File("text.txt")
        newFile.text = "Some text"
    }
}
