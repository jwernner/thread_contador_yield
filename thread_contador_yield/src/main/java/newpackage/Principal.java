/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Jorge
 */
public class Principal {
    public static void main(String args[ ]) {
	System.out.println("Antes da Janela:" + Thread.activeCount());
	MultiplaThread janela = new MultiplaThread();
	janela.setVisible(true);
	System.out.println("Depois da Janela:" + Thread.activeCount());
    }
}

