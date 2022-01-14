package com.birdasia

import java.io.Serializable

data class quiz_question(
    val id:Int,
    val question:String,
    val image:Int,
    val options:List<String>,
    val answer:Int
):Serializable