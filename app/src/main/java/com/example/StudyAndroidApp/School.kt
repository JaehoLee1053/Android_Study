package com.example.StudyAndroidApp

import io.realm.RealmObject

open class School : RealmObject() { // open 필수
    var name: String? = null
    var location: String? = null
}