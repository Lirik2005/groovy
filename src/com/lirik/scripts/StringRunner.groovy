package com.lirik.scripts

/**
 * Есть 7 способов создания строк (отличаются кавычками)
 */

def name = "Ivan"

def value = 'Hello "Hi"'  // если строка в одинарных кавычках, то у нее внутри можно использовать двойные кавычки без экранирования

def value2 = "Hello $name"  // передача в string другой string через знак $ это string interpolation. С одиночными кавычками НЕ РАБОТАЕТ!!!
println value2

def value3 = """
SELECT *
FROM
table flight
where name = $name
"""
println value3

def value4 = """
SELECT *
FROM
table flight
where name = ${getStringName(name)}
"""
println value4

def value5 = '''
SELECT *
FROM
table flight
where name =  $name
'''                       // string interpolation с одиночными кавычками НЕ РАБОТАЕТ!!!
println value5

def value6 = /Hello world $name/  //в таком варианте string не нужно экранировать кавычки
println value6

def value7 = $/Hello world $name/$  //такой способ используется в регулярных выражениях
println value7

def getStringName(String name) {
    name      //можно не указывать return и тогда Groovy вернет последнюю строку кода в методе
}