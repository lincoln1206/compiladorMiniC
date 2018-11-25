
package br.com.minic.geradoranalisadores;

import java_cup.internal_error;

import java.io.IOException;

/**
 * @author Hilario Tomaz Alves de Oliveira
 */

public class GeradorClassesJavaCup {

    public static void main(String[] args) throws internal_error, IOException, Exception {

        String[] argumentos = new String[]{"especificacoes/MiniC.cup"};

        java_cup.Main.main(argumentos);

    }

}
