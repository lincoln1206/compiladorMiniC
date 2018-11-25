
package br.com.minic;

import br.com.minic.analisadorlexico.AnalisadorLexico;
import br.com.minic.analisadorsintatico.parser;
import br.com.minic.elementos.ProgramaMiniC;
import java_cup.runtime.Symbol;

import java.io.FileReader;

public class CompiladorMiniC {

    public static void main(String[] args) throws Exception {

        FileReader arquivoTeste =
                new FileReader("programas/ProgramaTeste2.txt");

        AnalisadorLexico analisadorLexico = new AnalisadorLexico(arquivoTeste);

        parser analisadorSintatico = new parser(analisadorLexico);

        Symbol symbol = analisadorSintatico.parse();

        ProgramaMiniC programaMiniC = (ProgramaMiniC) symbol.value;

        System.out.println(programaMiniC);

    }

}
