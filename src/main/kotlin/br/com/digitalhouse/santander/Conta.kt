package br.digitial.com.aula06.santander


import java.math.BigDecimal

abstract class Conta(var saldo: BigDecimal, val cliente: Cliente) {
    open fun depositar(valor: BigDecimal) {
        this.saldo += valor
        println("O valor de R$${valor} foi depositado com sucesso")
    }

    open fun consultarSaldo(): BigDecimal {
        return this.saldo
    }

    abstract fun sacar(valor: BigDecimal)
}