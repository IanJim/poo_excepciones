package org.aldo.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Ingrese un valor numérico: ");
        int divisor;
        try {
            divisor = Integer.parseInt(valor);
            System.out.println(10 / divisor);
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto una excepción: ingrese un valor numérico: " + nfe.getMessage());
            main(args);
        }
        catch (ArithmeticException ae) {
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta con excepción o sin!");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación");
    }
}