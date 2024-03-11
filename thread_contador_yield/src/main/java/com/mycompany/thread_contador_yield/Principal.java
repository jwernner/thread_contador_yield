/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thread_contador_yield;

/**
 *
 * @author Jorge
 */
public class Principal {
    
    public static void main(String args[]) {

        Runnable r1 = new Contador("t1");
        Runnable r2 = new Contador("t2");
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
        
        //new Thread(t1).start();
        //new Thread(t2).start();

    }
}
