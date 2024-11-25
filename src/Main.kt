package Hotel

import kotlin.system.exitProcess

var nome: String = ""
val hotel = "Bithiatera"

fun main() {
    val senhacorreta = 2678
    var senha: Int

    println("Bem Vindo ao Hotel $hotel")

    print("Nome de Usuario: ")
    nome = readln().toString()

    do {
        print("Digite a senha: ")
        senha = readln().toInt()
        if (senha != senhacorreta) {
            println("Senha incorreta")
        }
    } while (senha != senhacorreta)

    println()

    inicio()
}

fun inicio() {
    print(
        "Bem vindo ao Hotel $hotel $nome!\n" +
                "É um imenso prazer ter você por aqui!\n"
    )

    print(
        "(1) Cadastrar Quartos\n" +
                "(2) Cadastrar Hospedes\n" +
                "(3) Abastecimento de Altomoveis\n" +
                "(4) Arcondicionado\n" +
                "(5) Agendar Evento\n" +
                "(6) Sair do Hotel\n"
    )
    print("Escolha uma opção:")
    val escolha = readln().toIntOrNull()
    when (escolha) {
        1 -> cadastrarQuartos()
        2 -> cadastrar()
        3 -> AbastecimentoDeAutomoveis()
        4 -> Arcondicionado()
        5 -> Alditorio()
        6 -> sairDoHotel()
        else -> erro()
    }
}



fun erro() {
    println("Por favor, informe um número entre 1 e 4.")
    inicio()
}

fun sairDoHotel() {
    println("Você deseja sair? S/N")
    val escolha = readln()

    when (escolha.uppercase()) {

        "S" -> {
            println("Muito obrigado e até logo, $nome.")
            exitProcess(0)
        }

        "N" -> {
            println("Voltando ao Inicio")
            inicio()
        }

        else -> {
            println("Desculpe, mas não compreendi.")
            sairCadastroDeHospedes()
        }
    }
}