/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escolamusica;

/**
 *
 * @author joaop
 */
public abstract class pessoa {
    protected String nome;
    protected int idade;
    
    public pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public abstract void atividade();
}
