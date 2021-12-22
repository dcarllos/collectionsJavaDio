package com.davicarlos;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(4.5);
        notas.add(8.5);
        notas.add(9.0);

        System.out.println(notas);
        System.out.println("Exiba o índice da nota 8.5: " + notas.indexOf(8.5));

        System.out.println("\nAdicione na lista a nota 7.5 na posição 3");
        notas.add(3, 7.5);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 4.5 por 6");
        notas.set(notas.indexOf(4.5), 6.0);
        System.out.println(notas);

        System.out.println("\nVerifique se a nota 4.5 está na lista: " + notas.contains(4.5));

        System.out.println("\n Exiba todas as notas na ordem em que foram informadas:");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("\n Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("\n Exiba a menor nota: " + Collections.min(notas));

        System.out.println("\n Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("\n Exiba a soma dos valores: " + soma);

        System.out.println("\n Exiba a média das notas: " + soma/notas.size());

        System.out.println("\n Remova a nota 8.5: ");
        notas.remove(notas.indexOf(8.5));
        System.out.println(notas);

        System.out.println("\n Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        notas.add(4.8);
        System.out.println(notas);

        System.out.println("\n Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("\n Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("\n Confira se a lista está vazia: " + notas.isEmpty());


        //Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:


        LinkedList<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);


        System.out.println("\nMostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst());
        System.out.println(notas2);

        System.out.println("\nMostre a primeira nota da nova lista removendo-o: " + notas2.poll());
        System.out.println(notas2);

    }
}



















