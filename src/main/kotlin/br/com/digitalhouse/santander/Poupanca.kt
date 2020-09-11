package br.digitial.com.aula06.santander

import java.math.BigDecimal

class Poupanca(saldo: BigDecimal, cliente: Cliente) : Conta(saldo, cliente) {
    var taxaJuros = BigDecimal.valueOf(0.005)
    override fun sacar(valor: BigDecimal) {
        when {
            this.saldo >= valor -> {
                this.saldo -= valor
                println("Saque de R$$valor realizado com sucesso!!")
            }
            else -> {
                println("Saldo insuficiente")
            }
        }
    }

    fun recolherJuros(): BigDecimal {
        return saldo * (BigDecimal.valueOf(1.0) + taxaJuros)
    }
}