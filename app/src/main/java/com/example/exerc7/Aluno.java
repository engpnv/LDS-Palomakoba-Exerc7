package com.example.exerc7;

public class Aluno {
   private String nome, endereco, email;

    public Aluno(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public Aluno(Aluno alunoCopia) {
        this.nome = alunoCopia.nome;
        this.endereco = alunoCopia.endereco;
        this.email = alunoCopia.email;
    }

    public Aluno() {
        nome = "";
        endereco = "";
        email = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome;
    }
}
