/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author joaop
 */
class Funcionario extends pessoa {
    protected String cargo;
    
    public Funcionario(String nome, int idade, String cargo){
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    
    }

    public void trabalhar() {
       System.out.print(nome +" esta trabalhando");
    }

    @Override
    public void atividade() {
      
    }
}