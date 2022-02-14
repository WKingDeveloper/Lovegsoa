package com.wkingdeveloper.lovegsoa.repository

import com.wkingdeveloper.lovegsoa.model.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User,Long>{
}