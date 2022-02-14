package com.wkingdeveloper.lovegsoa.model

import com.wkingdeveloper.lovegsoa.model.common.DBCreate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User (
        var nickName: String,
        var firstName: String,
        var lastName: String,
        @Id @GeneratedValue var id: Long? = null) : DBCreate()