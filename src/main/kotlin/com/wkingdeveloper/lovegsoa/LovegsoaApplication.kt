package com.wkingdeveloper.lovegsoa

import com.wkingdeveloper.lovegsoa.model.User
import com.wkingdeveloper.lovegsoa.repository.UserRepository
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LovegsoaApplication

fun main(args: Array<String>) {
    runApplication<LovegsoaApplication>(*args)
}
