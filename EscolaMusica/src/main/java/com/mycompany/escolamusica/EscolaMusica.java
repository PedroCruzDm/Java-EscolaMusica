/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escolamusica;

/**
 *
 * @author joaop
 */
public class EscolaMusica {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("arthur", 16, 12);
        Professor p1 = new Professor ("cleiton", 53, "atividade de matematica");
        Funcionario f1 = new Funcionario ("Carlos", 34, "Diretor"){};
        
        
        
        p1.ministrar();
        p1.passarAtividade();
        a1.atividade();
        f1.trabalhar();
    }
}
