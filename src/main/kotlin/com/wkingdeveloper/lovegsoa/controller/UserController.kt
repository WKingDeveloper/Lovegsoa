package com.wkingdeveloper.lovegsoa.controller

import com.wkingdeveloper.lovegsoa.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller

class UserController(
        val userService: UserService
) {

    @GetMapping("/user/save")
    @ResponseBody
    fun userSave(): String {
        userService.save()
        return "save"
    }
    @GetMapping("/user/find")
    @ResponseBody
    fun userFind(): String {
        userService.find()
        return "find"
    }

}