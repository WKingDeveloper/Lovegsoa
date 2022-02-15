package com.wkingdeveloper.lovegsoa.service

import com.wkingdeveloper.lovegsoa.model.User
import com.wkingdeveloper.lovegsoa.model.UserStatus
import com.wkingdeveloper.lovegsoa.repository.UserRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class UserService(
        val userRepository: UserRepository
) {
    fun save() {
//        println("UserStatus.Active = ${UserStatus.Active}")

        val user = User("WKD", "WKing", "Developer", UserStatus.ACTIVE)
        val user2 = User("WKD2", "WKing2", "Developer2", UserStatus.INACTIVE)
        userRepository.save(user)
        userRepository.save(user2)
    }

    fun find() {
        var user3 = userRepository.findById(1)
        var user4 = userRepository.findById(2)
        println("user3 = ${user3.get().status}")
        println("user4 = ${user4.get().status}")
    }
}