package com.android.chatapp

data class Hobby(var title:String)
object Supplier{
    val hobbies = listOf<Hobby>(
        Hobby("Coding"),
        Hobby("Running"),
        Hobby("Gaming"),
        Hobby("Listening to Songs"),
        Hobby("Travelling"),
        Hobby("Dancing"),
        Hobby("Playing FIFA"),
        Hobby("Writing"),
        Hobby("Art"),
        Hobby("Poetry"),

    )
}