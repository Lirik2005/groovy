package com.lirik.practice

/**
 * Добавить возможность складывать различные единицы измерения.
 * Например: 3.cm +1.m -25.mm = 1005 (mm)
 */

class Task02 {

    static void main(String[] args) {

        Integer.metaClass {
            getCm = {
                delegate * 10
            }
            getM = {
                delegate.cm * 100
            }
            getMm = {
                delegate
            }
        }
        def result = 3.cm + 1.m - 25.mm
        println(result)
    }

    private static Object firstOption() {
        use(IntegerMethods) {
            def result = 3.cm + 1.m - 25.mm
            println(result)
        }
    }

    private static void secondOption() {
        Integer.metaClass.getCm = {
            delegate * 10
        }
        Integer.metaClass.getM = {
            delegate.cm * 100
        }
        Integer.metaClass.getMm = {
            delegate
        }
        def result = 3.cm + 1.m - 25.mm
        println(result)
    }
}
