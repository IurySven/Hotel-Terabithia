package Hotel

import java.util.*

data class QuartoInfo(
    var ocupado: Int,
    var diarias: Int,
    var valorTotal: Double,
    var nome: String
)

var Quartos = mutableMapOf(
    1 to QuartoInfo(0, 0, 0.0, nome = ""),
    2 to QuartoInfo(0, 0, 0.0, nome = ""),
    3 to QuartoInfo(0, 0, 0.0, nome = ""),
    4 to QuartoInfo(1, 10, 550.0, nome = "Jorge Exemplo"),
    5 to QuartoInfo(0, 0, 0.0, nome = ""),
    6 to QuartoInfo(1, 0, 0.0, nome = ""),
    7 to QuartoInfo(0, 0, 0.0, nome = ""),
    8 to QuartoInfo(0, 0, 0.0, nome = ""),
    9 to QuartoInfo(1, 30, 3000.0, nome = "Gabriel"),
    10 to QuartoInfo(1, 30, 299.7, nome = "Iury Sven"),
    11 to QuartoInfo(0, 0, 0.0, nome = ""),
    12 to QuartoInfo(1, 15, 680.4, nome = "Takakara Nomuro"),
    13 to QuartoInfo(0, 0, 0.0, nome = ""),
    14 to QuartoInfo(0, 0, 0.0, nome = ""),
    15 to QuartoInfo(0, 0, 0.0, nome = ""),
    16 to QuartoInfo(0, 0, 0.0, nome = ""),
    17 to QuartoInfo(0, 0, 0.0, nome = ""),
    18 to QuartoInfo(0, 0, 0.0, nome = ""),
    19 to QuartoInfo(0, 0, 0.0, nome = ""),
    20 to QuartoInfo(1, 5, 150.0, nome = "Victor")

)

fun quartos(){
    println("(1) Cadastrar Quartos\n" +
            "(2) Mostrar Quartos\n")
    print("Selecione uma Opção: ")
    var ope = readln().toInt()
    when(ope){
        1 -> cadastrarQuartos()
        2-> mostrarQuartos()

    }


}

fun cadastrarQuartos() {

    var valor: Double
    var diarias: Int
    var quarto: Int

    do {

        print("Qual Quarto Reservar(1-20): ")
        quarto = readln().toInt()
        val quartoInfo = Quartos[quarto]
        if (quartoInfo?.ocupado == 1) {
            println("Quarto Ocupado")

        }

    } while (quartoInfo?.ocupado == 1)
    println()

    do {
        print("Qual é o Valor Padrão da Diaria: ")
        valor = readln().toDouble()
        if (valor <= 0) {
            println("Valor de Diaria Invalido")

        }

    } while (valor <= 0)
    println()

    do {
        print("Quantas Diarias Serão Nessessarias: ")
        diarias = readln().toInt()
        if (diarias > 30) {
            println("Numero de Diarias Exede 30 Dias")

        }

    } while (diarias > 30)

    var total = valor * diarias
    println("O Valor de $diarias Dias de Hospedagem é de R$$total")
    println()

    print("Continuar(S/N)? ")
    var cont = readln().lowercase(Locale.getDefault())
    when (cont) {
        "s" -> user(diarias, quarto, total)

        "n" -> cadastrarQuartos()

    }

    println()

}

fun user(diarias: Int, quarto: Int, total: Double) {

    var nomeHospede: String

    print("Qual é o Nome do Hospede: ")
    nomeHospede = readln().toString()

    println("$nome, Voce confirma a Hospedagem de $nomeHospede por $diarias no Quarto $quarto por R$$total")
    print("Confirmar(S/N): ")
    var cont = readln().lowercase(Locale.getDefault())
    when (cont) {
        "s" -> {
            Quartos[quarto] = QuartoInfo(1, diarias, total, nomeHospede)
            println("$nome, reserva efetuada para $nomeHospede")
            inicio()

        }

        "n" -> inicio()

    }

}

fun mostrarQuartos(){
    println("Quartos Disponiveis:")
    Quartos.forEach{(numero, info)->
        if (info.ocupado == 0){
            print("Quarto $numero\n")

        }

    }

    println()
    println("Quartos Ocupados:")
    Quartos.forEach{(numero, info)->
        if (info.ocupado == 1){
            print("Quarto $numero\n")

        }

    }

}