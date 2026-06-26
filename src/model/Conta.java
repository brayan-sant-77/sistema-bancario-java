package model;

import exception.SaldoInsuficienteException;

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

    public void depositar(double valor) throws SaldoInsuficienteException {
        saldo += valor;
        System.out.println("Realizado com Sucesso!");
        System.out.println("Valor em conta: " + saldo);
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        saldo -= valor;
        System.out.println("Realizado com Sucesso!");
        System.out.println("Valor em conta: " + saldo);
    }
    public void consultarSaldo() {

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
