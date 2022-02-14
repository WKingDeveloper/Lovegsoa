package com.wkingdeveloper.lovegsoa.model.common

import java.time.LocalDateTime
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class DBCreate{
        val createdBy: String = "createWKD"
        var updateedBy: String = "updateWKD"
        val createdDateTime: LocalDateTime = LocalDateTime.now()
        var updatedDateTime: LocalDateTime = LocalDateTime.now()
}