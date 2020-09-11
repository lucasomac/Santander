package br.digitial.com.aula06.santander

import java.math.BigDecimal
import java.util.*

class Corrente(saldo: BigDecimal, cliente: Cliente, var chequeEspecial: BigDecimal) : Conta(saldo, cliente) {
    var utilizadoChequeEspecial = BigDecimal.valueOf(0.0)
    override fun sacar(valor: BigDecimal) {
        when {
            this.saldo + chequeEspecial - utilizadoChequeEspecial >= valor -> {
                when {
                    valor > this.saldo -> {
                        utilizadoChequeEspecial += valor - this.saldo
                        this.saldo = 0
                    }
                    else -> {
                        this.saldo -= valor
                    }
                }
                println("Saque de R$$valor realizado com sucesso!!")
            }
            else -> {
                println("Saldo insuficiente")
            }
        }
    }

    override fun consultarSaldo(): BigDecimal {
        return super.consultarSaldo() + this.chequeEspecial - this.utilizadoChequeEspecial
    }

//    override fun depositar() {
//
//    }

    fun depositarCheque(cheque: Cheque) {
        when {
            Date() >= cheque.dataPagamento -> {
                this.saldo += cheque.valor
            }
            else -> {
                println("Cheque fora do período de compenssação")
            }
        }
    }
}