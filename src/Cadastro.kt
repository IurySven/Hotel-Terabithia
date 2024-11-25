package Hotel

import java.util.*


fun cadastrar() {
    val listaHospedes = mutableListOf(
        "Carlos Villagran",
        "Maria Antonieta de las Nieves",
        "Roberto Gómez Bolaños",
        "Florinda Meza",
        "Ramón Valdés",
        "Rubén Aguirre",
        "Angelines Fernández",
        "Edgar Vivar",
        "Horácio Gómez Bolaños",
        "Raúl Padilla"

    )

    while (true) {
        println(
            """Cadastro de Hóspedes
            Selecione uma opção:
            1. Cadastrar Hospede
            2. Cadastrar Hospedes
            3. Pesquisar
            4. Sair"""

        )

        val escolha = readln().toIntOrNull()

        when (escolha) {
            1 -> cadastrarHospede(listaHospedes)
            2-> cadastrarHospedes()
            3 -> pesquisarHospede(listaHospedes)
            4 -> sairCadastroDeHospedes()
            else -> erroCadastroDeHospedes()

        }

    }

}

fun cadastrarHospede(listaHospedes: MutableList<String>) {
    println("Cadastro de Hóspedes.\nPor favor, informe o nome da Hóspede:")
    val novoHospede = readln()
    listaHospedes.add(novoHospede)

    println("$novoHospede cadastrado com sucesso!")
    println("Lista de Hóspedes atuais " + listaHospedes)

    // Não é necessário chamar a função cadastrarHospedes(), pois o loop while já está chamando.
}

fun pesquisarHospede(listaHospedes: MutableList<String>) {
    println("Pesquisa de Hóspedes.\nPor favor, informe o nome do Hóspede:")
    val nomeHospede = readln()

    if (listaHospedes.any { it.contains(nomeHospede, ignoreCase = true) }) {
        println("\nEncontramos a(s) hóspede(s):")
        listaHospedes.filter { it.contains(nomeHospede, ignoreCase = true) }
            .forEach { println(it) }
    } else {
        println("Não encontramos nenhuma hóspede com esse nome.")

    }

}

fun sairCadastroDeHospedes() {
    println("Você deseja sair? S/N")
    val escolha = readln()

    when (escolha.uppercase()) {
        // uppercase fará o que for digitado ser convertido para maiúsculo por exemplpo x -> X
        "S" -> {
            println("Saindo...")
            inicio()

        }

        "N" -> {
            println("Ok, voltando ao início.")
            cadastrar()

        }

        else -> {
            println("Desculpe, mas não compreendi.")
            sairCadastroDeHospedes()

        }

    }

}

fun erroCadastroDeHospedes() {
    println("Por favor, informe um número entre 1 e 3.")

}

fun cadastrarHospedes() {
    println("Qual o valor padrão da diária?")
    val valorDiaria = readln().toDouble()

    var gratuidadeCont = 0

    var meiaHospedagemCont = 0

    var totalHospedagem = 0.0

    println()

    while (true) {
        println("Qual o nome do hóspede?")
        val nomeHospede = readln().lowercase(Locale.getDefault())
        if (nomeHospede == "pare") {
            break

        }

        println("Qual a idade do hóspede?")
        val idadeHospede = readln().toInt()
        println()

        when {
            idadeHospede < 6 -> {
                println("$nomeHospede possui gratuidade.")
                gratuidadeCont++

            }

            idadeHospede > 60 -> {
                println("$nomeHospede paga meia.")
                meiaHospedagemCont++
                totalHospedagem += valorDiaria / 2

            }

            else -> {
                totalHospedagem += valorDiaria
            }

        }

        println("$nomeHospede cadastrado(a) com sucesso.")

    }

    val totalHospedes = gratuidadeCont + meiaHospedagemCont + totalHospedagem / valorDiaria

    println("O Valor Total das Hospedagens é: R$$totalHospedagem; $gratuidadeCont Gratuidade(s); $meiaHospedagemCont Meia(s).")

}