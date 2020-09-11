package br.digitial.com.aula06.santander

import java.math.BigDecimal

fun main() {

    val conta1 = Poupanca(BigDecimal.valueOf(500), Cliente(1, "Macedo", "79856", "01236548975"))
    val conta2 =
            Corrente(BigDecimal.valueOf(500), Cliente(1, "Félix", "23622", "91276348925"), BigDecimal.valueOf(500))

//    println("O valor do saldo é de ${conta1.consultarSaldo()}")
//    conta1.sacar(BigDecimal.valueOf(500))
//    conta1.depositar(BigDecimal.valueOf(400))
//    conta1.sacar(BigDecimal.valueOf(501))
//    println("O valor do recolhimento dos juros foi de ${conta1.recolherJuros()}")


    println("O valor do saldo é de ${conta2.consultarSaldo()}")
    conta2.sacar(BigDecimal.valueOf(400))
    println("O valor do saldo é de ${conta2.consultarSaldo()}")
    conta2.sacar(BigDecimal.valueOf(200))
    println("O valor do saldo é de ${conta2.consultarSaldo()}")
    conta2.depositar(BigDecimal.valueOf(50))
    println("O valor do saldo é de ${conta2.consultarSaldo()}")
    conta2.sacar(BigDecimal.valueOf(451))
    println("O valor do saldo é de ${conta2.consultarSaldo()}")
    conta2.depositar(BigDecimal.valueOf(51))
    println("O valor do saldo é de ${conta2.consultarSaldo()}")
//    conta1.depositar(BigDecimal.valueOf(500))
//    conta2.sacar(BigDecimal.valueOf(600))
//    conta2.depositarCheque(Cheque(BigDecimal.valueOf(12), "Nubank", Date(2020, 12, 12)))
//    conta2.depositarCheque(Cheque(BigDecimal.valueOf(12), "C6", Date(2020, 9, 9)))
//    conta2.depositarCheque(Cheque(BigDecimal.valueOf(12), "Digio", Date(2020, 9, 1)))
//    println("O valor do saldo é de ${conta2.consultarSaldo()}")
}