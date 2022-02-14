package com.wkingdeveloper.lovegsoa.service

import com.wkingdeveloper.lovegsoa.model.User
import com.wkingdeveloper.lovegsoa.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
        val userRepository: UserRepository
) {
    fun save() {
        val user = User("WKD", "WKing", "Developer")
        userRepository.save(user)
    }
}