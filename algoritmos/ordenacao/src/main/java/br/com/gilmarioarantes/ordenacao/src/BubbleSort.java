package br.com.gilmarioarantes.ordenacao.src;

import java.io.IOException;

public class BubbleSort {
    private static void bubbleSort(int[] vetor){

        boolean troca = true;
        int aux;

        while(troca){
            troca = false;
            for(int i = 0; i < vetor.length - 1; i++){
                if(vetor[i] < vetor[i+1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = aux;
                    troca = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int quantidade = 10000;
        int[] vetor = new int[quantidade];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random()*quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        bubbleSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms.");
    }
}
