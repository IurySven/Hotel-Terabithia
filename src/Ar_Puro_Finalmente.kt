package Hotel

import java.util.*

data class Empresa(
    val nome: String,
    val valorPorAparelho: Double,
    val quantidadeAparelhos: Int,
    val porcentagemDesconto: Double,
    val quantidadeMinimaDesconto: Int
)

fun Arcondicionado() {
    val empresas = mutableListOf<Empresa>()
    var desejaContinuar: String

    do {
        println("Qual o Nome da Empresa?")
        val nomeEmpresa = readln().toString()
        println()

        println("Qual o Valor Por Aparelho?")
        val valorPorAparelho = readln().toDouble()
        println()

        println("Qual a quantidade de aparelhos?")
        val quantidadeAparelhos = readln().toInt()
        println()

        println("Qual a porcentagem de desconto?")
        val porcentagemDesconto = readln().toDouble()
        println()

        println("Qual o número mínimo de aparelhos para conseguir o desconto?")
        val quantidadeMinimaDesconto = readln().toInt()
        println()

        val empresa = Empresa(
            nome = nomeEmpresa,
            valorPorAparelho = valorPorAparelho,
            quantidadeAparelhos = quantidadeAparelhos,
            porcentagemDesconto = porcentagemDesconto,
            quantidadeMinimaDesconto = quantidadeMinimaDesconto

        )

        empresas.add(empresa)

        val totalServico = calcularValorServico(empresa)
        println("O Serviço de ${empresa.nome} Custara R$${(totalServico)}")

        println("Deseja Informar Novos Dados, $nome(S/N)? ")
        desejaContinuar = readln().lowercase(Locale.getDefault())
    } while (desejaContinuar == "s")

    val menorOrcamento = empresas.minByOrNull { calcularValorServico(it) }
    if (menorOrcamento != null) {
        val valorMenorOrcamento = calcularValorServico(menorOrcamento)
        println("O Orçamento de Menor Valor é o de ${menorOrcamento.nome} Por R$${(valorMenorOrcamento)}")

    }

}

fun calcularValorServico(empresa: Empresa): Double {
    val totalSemDesconto = empresa.valorPorAparelho * empresa.quantidadeAparelhos
    val totalComDesconto = if (empresa.quantidadeAparelhos >= empresa.quantidadeMinimaDesconto) {
        totalSemDesconto * (1 - empresa.porcentagemDesconto / 100)

    } else {
        totalSemDesconto

    }

    return totalComDesconto

}
