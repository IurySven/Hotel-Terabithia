package Hotel

fun AbastecimentoDeAutomoveis() {
    println("Qual o Valor do Alcool no Posto Wayne Oil?")
    val precoAlcoolWayne = readln().toDouble()
    println()

    println("Qual o Valor da Gasolina no Posto Wayne Oil?")
    val precoGasolinaWayne = readln().toDouble()
    println()

    println("Qual o Valor do Alcool no Posto Stark Petrol?")
    val precoAlcoolStark = readln().toDouble()
    println()

    println("Qual o Valor da Gasolina no Posto Stark Petrol?")
    val precoGasolinaStark = readln().toDouble()
    println()


    val totalAlcoolWayne = precoAlcoolWayne * 42

    val totalGasolinaWayne = precoGasolinaWayne * 42

    val totalAlcoolStark = precoAlcoolStark * 42

    val totalGasolinaStark = precoGasolinaStark * 42


    val alcoolMaisBaratoWayne = precoAlcoolWayne <= precoGasolinaWayne * 0.7

    val alcoolMaisBaratoStark = precoAlcoolStark <= precoGasolinaStark * 0.7


    var melhorPosto = ""

    var melhorCombustivel = ""


    when {
        alcoolMaisBaratoWayne && totalAlcoolWayne < totalAlcoolStark -> {
            melhorPosto = "Wayne Oil"
            melhorCombustivel = "Alcool"

        }

        alcoolMaisBaratoWayne && totalGasolinaWayne < totalGasolinaStark -> {
            melhorPosto = "Wayne Oil"
            melhorCombustivel = "Gasolina"

        }

        alcoolMaisBaratoStark && totalAlcoolStark < totalAlcoolWayne -> {
            melhorPosto = "Stark Petrol"
            melhorCombustivel = "Alcool"

        }

        else -> {
            melhorPosto = "Stark Petrol"
            melhorCombustivel = "Gasolina"
        }

    }

    println("$nome, é mais barato abastecer com $melhorCombustivel no posto $melhorPosto.")

}