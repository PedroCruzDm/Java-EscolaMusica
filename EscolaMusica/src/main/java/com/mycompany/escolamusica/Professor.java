/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author joaop
 */
class Professor extends pessoa {
    private String atividade;
    
    public Professor(String nome, int idade, String atividade){
        super(nome, idade);
        this.nome = nome;
        this.idade = idade;
        this.atividade = atividade;
    }

    public void ministrar(){
        System.out.println(nome+" esta ministrando a aula");
    }
    
    public void passarAtividade() {
        System.out.println(nome+" esta passando atividade");
    }

    @Override
    public void atividade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
