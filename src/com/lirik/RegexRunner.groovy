package com.lirik

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {

    static void main(String[] args) {

        String value = "one 1 two 22 three 333"
        String regexInJava = "\\w+ \\d+"  // так бы мы писали регулярное выражение в JAVA
        String regexInGroovy = /\w+ \d+/  // так бы мы писали регулярное выражение в Groovy (т.е. тут не надо ничего экранировать)

        Pattern pattern = Pattern.compile(regexInGroovy)
        Pattern patternInGroovy = ~regexInGroovy
        Matcher matcher = pattern.matcher(value)
        boolean result = matcher.matches()
        println result

        while (matcher.find()) {
            matcher.group()
        }
    }

}
