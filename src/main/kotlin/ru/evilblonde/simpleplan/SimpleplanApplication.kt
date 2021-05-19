package ru.evilblonde.simpleplan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleplanApplication

fun main(args: Array<String>) {
    runApplication<SimpleplanApplication>(*args)
}
