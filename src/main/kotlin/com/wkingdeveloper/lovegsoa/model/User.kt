package com.wkingdeveloper.lovegsoa.model

import com.wkingdeveloper.lovegsoa.converter.UserStatusConverter
import com.wkingdeveloper.lovegsoa.model.common.DBCreate
import javax.persistence.*

@Entity
class User (
        var nickName: String,
        var firstName: String,
        var lastName: String,
//        @Enumerated(value = EnumType.STRING)
//        @Enumerated
        @Convert(converter = UserStatusConverter::class)
        var status: UserStatus,
        @Id @GeneratedValue var id: Long? = null) : DBCreate()