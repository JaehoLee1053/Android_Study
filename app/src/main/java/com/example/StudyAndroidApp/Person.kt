package com.example.StudyAndroidApp

import java.io.Serializable

class PersonFromServer(
    val id: Int? = null,
    val name: String? = null,
    var age: Int? = null,
    var intro: String? = null
) : Serializable {

}