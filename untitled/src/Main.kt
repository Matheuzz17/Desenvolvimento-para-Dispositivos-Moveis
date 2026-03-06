fun main() {

    var saldo = 0.0

    var opcao: Int

    do {
        println("========================================================")
        println("1 -> Sair | 2 -> Sacar | 3 -> Depositar | 4 -> Consultar Saldo")
        println("========================================================")
        print("Digite uma opção: ")

        opcao = readLine()?.toIntOrNull() ?:0

        when (opcao) {

            2 -> {
                print("Digite o valor para sacar: ")
                val saque = readLine()?.toDoubleOrNull() ?: 0.0

                if (saque <= saldo && saque > 0) {
                    saldo -= saque
                    println("Saque realizado com sucesso.")
                } else {
                    println("Saldo insuficiente ou valor inválido.")
                }
            }

            3 -> {
                print("Digite o valor para depositar: ")
                val deposito = readLine()?.toDoubleOrNull() ?: 0.0

                if (deposito > 0) {
                    saldo += deposito
                    println("Depósito realizado com sucesso.")
                } else {
                    println("Valor inválido.")
                }
            }

            4 -> {
                println("Seu saldo atual é: R$ $saldo")
            }

            0 -> {
                println("Saindo do sistema...")
            }

            else -> {
                println("Opção inválida.")
            }
        }

    } while (opcao != 1)

    println("operação finalizada")
}