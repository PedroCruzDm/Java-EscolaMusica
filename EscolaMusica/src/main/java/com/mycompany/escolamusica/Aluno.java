/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author joaop
 */
class Aluno extends pessoa {
     protected int Nmatricula;
     
     public Aluno(String nome, int idade, int Nmatricula){
       super(nome, idade);
       this.nome = nome;
       this.idade = idade;
       this.Nmatricula = Nmatricula;
     }
     
    @Override
    public void atividade() {
        System.out.println("fazendo atividade");
    }
    
}