package model;

import java.util.Arrays;

public class Cliente {


    private String nome;
    final String CPF;
    private String telefone;
    private String dataNascimento;
    private String email;

    public Cliente(String nome, String CPF, String telefone, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
