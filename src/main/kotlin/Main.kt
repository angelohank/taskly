package br.com

import br.com.network.JSONPlaceholderRequest
import java.util.Scanner

fun main() {
    println("Bem vindo ao TaskLy!")
    val input = Scanner(System.`in`)

    println("informe o id da task")
    val resposta = input.nextInt()

    val task = JSONPlaceholderRequest().getTaskById(resposta)
    println(task)
}