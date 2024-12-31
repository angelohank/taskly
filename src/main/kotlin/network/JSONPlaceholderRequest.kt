package br.com.network

import br.com.model.Task

class JSONPlaceholderRequest() : RequestHandler() {

    fun getTaskById(id:Int) : Task? {
        val todosEndpoint = "https://jsonplaceholder.typicode.com/todos"
        val response = doRequest(todosEndpoint + "/${id.toString()}")

        var task: Task? = null

        //TODO caso mude o nome dos objetos na classe, pode ser criada uma camada de converter com um metodo fromJson
        task = Task.fromJson(response)

        return task
    }
}