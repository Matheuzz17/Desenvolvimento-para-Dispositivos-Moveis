fun main() {

    var saldo = 0.0
    var opcao: Int

    fun sacar() {

        print("Digite o valor para sacar: ")

        val saque = readLine()?.toDoubleOrNull() ?: 0.0

        if (saque <= saldo && saque > 0) {
            saldo -= saque
            println("Saque realizado com sucesso.")
        } else {
            println("Saldo insuficiente ou valor inválido.")
        }
    }
    fun depositar(){
        print("Digite o valor para depositar: ")

        val deposito = readLine()?.toDoubleOrNull() ?: 0.0

        if (deposito > 0) {
            saldo += deposito
            println("Depósito realizado com sucesso.")
        } else {
            println("Valor inválido.")
        }
    }
    fun consultarsaldo(){
        println("Seu saldo atual é: R$ $saldo")
    }
    fun sair(){
        println("Saindo do sistema...")
    }


    do {

        println("========================================================")
        println("1 -> Sair | 2 -> Sacar | 3 -> Depositar | 4 -> Consultar Saldo")
        println("========================================================")

        print("Digite uma opção: ")

        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {

            2 -> {
                sacar()
            }

            3 -> {
                depositar()
            }

            4 -> {
              consultarsaldo()
            }

            1 -> {
               sair()
            }

            else -> {
                println("Opção inválida.")
            }
        }

    } while (opcao != 1)

    println("Operação finalizada")
}