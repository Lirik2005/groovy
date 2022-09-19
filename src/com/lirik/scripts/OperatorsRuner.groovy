package com.lirik.scripts

assert 1 + 2 == 3
assert 4 - 3 == 1
assert 3 * 5 == 15
assert 3 / 2 == 1.5 //В отличие от JAVA тут мы получаем дробное число. Если мы хотим получить целое то нам надо сделать как в строке ниже
assert 3.intdiv(2) == 1
assert 1 + 2 == 3
assert 10 % 3 == 1
assert 2**3 == 8

def result =(3/2) as Integer //так работает привидение типов в Groovy

println(result<=29)
