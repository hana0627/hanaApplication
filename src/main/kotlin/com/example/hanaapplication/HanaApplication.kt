package com.example.hanaapplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HanaApplication

fun main(args: Array<String>) {
    runApplication<HanaApplication>(*args)
}
