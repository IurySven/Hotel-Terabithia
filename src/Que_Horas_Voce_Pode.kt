package Hotel

import java.util.*
import kotlin.math.ceil

fun main() {
    Alditorio()
}

fun Alditorio() {
    val alditColorado = 350
    val alditLaranja = 150
    val cadeirasAdicionais = 70

    print("Qual o Numero de Convidados Para o Seu Evento? ")
    val convidados = readln().toInt()
    println()

    if (convidados <= 220) {
        val cadeiras = alditLaranja + if (convidados > alditLaranja) cadeirasAdicionais else 0
        val adicionar = if (cadeiras < convidados) convidados - alditLaranja else 0

        if (convidados <= alditLaranja) {
            println("Use o Alditorio Laranja")
        } else {
            println("Use o Alditorio Laranja (Adicione Mais $adicionar Cadeiras)")
        }
    } else if (convidados <= alditColorado) {
        println("Use o Alditorio Colorado")
    } else {
        println("Numero de Convidados Superior a Capacidade Maxima")
    }

    println()
    DiaEvento(convidados)
}

fun DiaEvento(convidados: Int) {
    println(
        "Quando Será o Evento?\n" +
                "segunda a sexta Das 7 as 23 Horas\n" +
                "sabado e domingo Das 7 as 15 Horas\n"
    )

    print("Qual o Dia do Seu Evento? ")
    val dia = readln().toString().lowercase(Locale.getDefault())
    println()

    print("Qual o Horario do Seu Evento? ")
    val hora = readln().toInt()
    println()

    if ((dia in listOf("segunda", "terça", "quarta", "quinta", "sexta") && hora in 7..23) ||
        (dia in listOf("sabado", "domingo") && hora in 7..15)
    ) {
        println("Auditório Disponivel")
        println()
    } else {
        println("Auditório indisponível")
        DiaEvento(convidados)
        return
    }

    print("Qual é o Nome da Empresa Que Vai Realizar o Evento? ")
    val nomeEmpresa = readln().toString()
    println()

    println("Auditório reservado para $nomeEmpresa. $dia às ${hora}hs")
    println()

    Funcionarios(convidados, dia, hora, nomeEmpresa)
}

fun Funcionarios(convidados: Int, dia: String, hora: Int, nomeEmpresa: String) {
    val garcons = 10.50

    print("Qual é a Duração do Evento em Horas? ")
    val duracao = readln().toInt()

    val horasGar = ceil(duracao / 2.0).toInt()
    val convidadoGar = ceil(convidados / 12.0).toInt()
    val totalGar = convidadoGar + horasGar
    val totalValorGarcons = totalGar * duracao * garcons

    println("São Necessarios $totalGar Garçons\nCusto de R$${"%.2f".format(totalValorGarcons)}")
    println()

    Buffet(convidados, totalValorGarcons, duracao, dia, hora, nomeEmpresa)

}

fun Buffet(convidados: Int, totalValorGarcons: Double, duracao: Int, dia: String, hora: Int, nomeEmpresa: String) {
    val quantCafe = ceil(0.2 * convidados).toInt()
    val quantAgua = ceil(0.5 * convidados).toInt()
    val quantSalgado = 7 * convidados

    val custoCafe = quantCafe * 0.80
    val custoAgua = quantAgua * 0.40
    val custoSalgado = (quantSalgado / 100.0) * 34.0

    val totalBuffet = custoSalgado + custoAgua + custoCafe

    println("O Evento Precisará de $quantCafe Litros de Café, $quantAgua Litros de Água e $quantSalgado Salgados")
    println("Custo do Buffet: R$$totalBuffet")
    println()

    val custoTotal = totalValorGarcons + totalBuffet
    println("Evento no Auditório.\nNome da Empresa: $nomeEmpresa\nData: $dia, às $hora hs\nDuração do evento: $duracao horas\nQuantidade de Convidados: $convidados")
    println("Custo dos garçons: R$$totalValorGarcons\nCusto do Buffet: R$$totalBuffet \nValor total do Evento: R$$custoTotal")
    println()

    print("$nome Gostaria de efetuar a reserva? S/N: ")
    val resposta = readln().lowercase(Locale.getDefault())

    if (resposta == "s") {
        println("Reserva efetuada com sucesso.")

    } else {
        println("Reserva não efetuada.")

    }

    println()
    inicio()


}
