package br.com.gilmarioArantes.refatoracao.agrupamentoExcecoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ManipulaArquivo {

    public void arquivoTeste(){
        try {
            FileInputStream arquivo=new FileInputStream("arquivoTexto.txt");
        } catch (FileNotFoundException e1) {
            System.out.println("Operação Cancelada, erro de arquivo/IO");
        } catch (IOException e2) {
            System.out.println("Operação Cancelada, erro de arquivo/IO");
        } catch (Exception e3) {
            System.out.println("Operação Cancelada, erro "+e3.getMessage());
        }
    }
}
