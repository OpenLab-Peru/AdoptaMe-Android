package com.josemiz.data.entities

import java.io.Serializable

data class UserEntity(
    val firstName : String,
    val lastName : String,
    val email : String,
    val phone : String
) : Serializable {
}