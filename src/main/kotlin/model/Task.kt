package br.com.model

import com.google.gson.Gson

data class Task(val title:String,
                val userId:Int,
                val id:Int,
                val completed:Boolean) {

    override fun toString(): String {
        return "Task(title='$title', userId=$userId, id=$id, completed=$completed)"
    }

    companion object {
        fun fromJson(json:String) : Task? {
            val gson = Gson()
            return gson.fromJson(json, Task::class.java)
        }
    }
}