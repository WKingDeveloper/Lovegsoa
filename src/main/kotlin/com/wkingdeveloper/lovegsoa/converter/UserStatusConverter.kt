package com.wkingdeveloper.lovegsoa.converter

import com.wkingdeveloper.lovegsoa.model.UserStatus
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class UserStatusConverter : AttributeConverter<UserStatus,String> {
    override fun convertToDatabaseColumn(attribute: UserStatus?): String {
/*        if (attribute.toString().equals("ACTIVE")) {
            return "활성"
        } else {
            return "비활성"
        }*/

        when (attribute.toString()) {
            "ACTIVE" -> return "활성"
            "INACTIVE" -> return  "비활성"
            else -> return "몰라용"
        }
    }

    override fun convertToEntityAttribute(dbData: String?): UserStatus {
        println("dbData = ${dbData}")
        when (dbData) {
            "활성" -> return UserStatus.valueOf("ACTIVE")
            "비활성" -> return UserStatus.valueOf("INACTIVE")
            else -> return UserStatus.valueOf("ACTIVE")
        }

    }
}
