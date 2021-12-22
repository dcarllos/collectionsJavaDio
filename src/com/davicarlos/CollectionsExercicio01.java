/*
* Programa que lê a temperatura média dos últimos 6 meses e as armazena em uma lista
* */

package com.davicarlos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsExercicio01 {
    public static void main(String[] args) {
        List<Double> tempMedia = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 6; i++){
            System.out.println("Digite a média da temperatura do mês " + i +": ");
            tempMedia.add(scan.nextDouble());
        }



        System.out.println(tempMedia);
        Double soma = 0d;
        for(int i = 0; i < tempMedia.size(); i++) {
            soma += tempMedia.get(i);
        }
        System.out.printf("\nA média semestral das temperaturas é: %.2f", (soma/6), "\n");
        for (int i = 0; i < tempMedia.size(); i++){
            if (tempMedia.get(i) > soma/6){
                System.out.println("\n"+tempMedia.get(i)+ " = Acima da média semestral.");
                if (i == 0) {
                    System.out.println("1 - Janeiro");

                    }else if (i == 1) {
                        System.out.println("2 - Fevereiro");
                    } else if (i == 2) {
                        System.out.println("3 - Março");
                    } else if (i == 3) {
                        System.out.println("4 - Abril");
                    } else if (i == 4) {
                        System.out.println("5 - Maio");
                    } else if (i == 5){
                        System.out.println("6 - Junho");
                    }else if (i == 6){
                        System.out.println("7 - Julho");
                }
                }
            }
        }

}
