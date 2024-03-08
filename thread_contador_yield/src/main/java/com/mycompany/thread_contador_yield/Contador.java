/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thread_contador_yield;

/**
 *
 * @author Jorge
 * 
 * Este código implementa uma classe Contador que é uma Runnable, ou seja, 
 * pode ser executada em uma thread. 
 * A classe possui um contador estático compartilhado 
 * entre todas as instâncias (i) e um nome (nome) para identificar 
 * cada instância individualmente. O método run() executa um loop 10 vezes, 
 * chamando o método conta() para incrementar o contador e imprimir 
 * o valor atual do contador junto com o nome da thread que o atualizou. 
 * 
 * A chamada Thread.yield() dentro do loop libera a CPU para outra thread 
 * com a mesma prioridade. Após o término do loop, uma mensagem indicando 
 * o término da execução da instância de Contador é impressa.

 */
   
// Definição da classe Contador, que implementa a interface Runnable
public class Contador implements Runnable {

    // Variável estática compartilhada entre todas as instâncias da classe
    private static int i = 0;
    
    // Variável de instância para armazenar o nome desta instância de Contador
    private String nome;

    // Construtor da classe Contador
    public Contador(String nome) {
        this.nome = nome; // Inicializa o nome da instância com o valor passado como argumento
    }

    // Método privado para realizar a contagem e imprimir o valor atual do contador
    private void conta() {
        i = i + 1; // Incrementa o contador
        // Imprime o valor atual do contador e o nome da thread que o atualizou
        System.out.println("Contador é: " + i + ", atualizado por: " + nome);
    }

    // Método run(), obrigatório devido à implementação da interface Runnable
    @Override
    public void run() {
        // Loop para executar a contagem 10 vezes
        for (int i = 0; i < 10; i++) {
            conta(); // Chama o método conta() para incrementar o contador e imprimir o valor
            // Libera a CPU para outra thread com a mesma prioridade
            Thread.yield();          
        }
        // Quando o loop termina, imprime uma mensagem indicando o término da execução desta instância de Contador
        System.out.println("Terminei " + nome);
    }
}

