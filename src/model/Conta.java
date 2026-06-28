package model;

import exception.ContaInexistenteException;import exception.SaldoInsuficienteException;
import exception.TransacaoInvalidaException;import exception.ValorInvalidoException;

public abstract class Conta {

    private Cliente cliente;

    private final String numeroConta;
    private double saldo;
    private final String agencia;

    public Conta(Cliente cliente, String numeroConta, String agencia) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor de depósito deve ser maio que 0!");
        }
        saldo += valor;
    }

    public void sacar(double valor) {
       if (valor <= 0) {
           throw new ValorInvalidoException("Valor deve ser maior do que zero!");
       }
       if (valor > saldo) {
           throw new SaldoInsuficienteException("Saldo Insuficiente para saque!");
       }

       saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor deve ser maior que zero!");
        }
        if (contaDestino == null) {
            throw new ContaInexistenteException("A conta informada não existe!");
        }
        if (this.equals(contaDestino)) {
            throw new TransacaoInvalidaException("Impossível realizar essa transação!");
        }

        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }
}
