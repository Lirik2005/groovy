package com.lirik.oop

/**
 * Почти тоже самое, что и интерфейс
 */

trait WithId {

    Integer id

    boolean validateId() {
        id > 0
    }
}