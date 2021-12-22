package com.davicarlos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsExercicio02 {
    public static void main(String[] args) {
        List<String> listaPerguntas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Responda as perguntas na sequência com S para sim e N para não.");
        System.out.println("\n1. Telefonou para a vítima? ");
        listaPerguntas.add(scan.next());

        System.out.println("\n2. Esteve no local do crime? ");
        listaPerguntas.add(scan.next());

        System.out.println("\n3. Mora perto da vítima? ");
        listaPerguntas.add(scan.next());

        System.out.println("\n4. Devia para a vítima? ");
        listaPerguntas.add(scan.next());

        System.out.println("\n5. Já trabalhou com a vítima? ");
        listaPerguntas.add(scan.next());



        int sim = 0;
        for (int i = 0; i < 5; i++) {
            if("S".equalsIgnoreCase(listaPerguntas.get(i))){
                sim += 1;
            }

        }
        if (sim == 2){
            System.out.println("\nSuspeita");
        }else if (sim == 3 || sim == 4){
            System.out.println("\nCúmplice");
        }else if (sim == 5){
            System.out.println("\nAssassina");
        }else{
            System.out.println("\nInocente");
        }

    }
}
