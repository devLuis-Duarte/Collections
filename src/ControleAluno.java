/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import collection.Aluno;

/**
 *
 * @author salda
 */
 /*

 Luis Duarte - SP3092089
 Ryan Henrique - SP3024521
 Gustavo Chaves - SP3047318
 Emily Miklos - SP3048993

*/
public class ControleAluno {

    private static ArrayList<Aluno> listaAluno = new ArrayList<>();
    private Set<Aluno> conjunto = new HashSet<>();
    private List<Integer> slist = Arrays.asList(4, 5, 1, 2, 8);

    public ArrayList<Aluno> listaTudo() {

        return listaAluno;

    }

    public void incluir(Aluno a) {
        listaAluno.add(a);
    }

    public void excluir(Aluno a) {
        listaAluno.remove(a);
    }

    public void editar(Aluno a) {
        int i = 0;

        for (Aluno al : listaAluno) {
            if (al.getRA() == a.getRA()) {
                listaAluno.set(i, a);
            }
        }
    }

    public Aluno Pesquisar(int RA) {
        Aluno resultado = new Aluno();
        int controle = 0;

        for (Aluno a : listaAluno) {
            if (a.getRA() == RA) {
                resultado = a;
                controle = 0;
            }
            if (controle == 1) {
                JOptionPane.showMessageDialog(null, "Aluno nao encontrado");
            }
        }
        return resultado;
    }

    public void ordenar() {
        System.out.println("Antes de ordenar" + slist);
        Collections.sort(slist);
        System.out.println("Depois de ordenar:" + slist);
    }

    public void MostrarElementosPares() {
        System.out.println("Lista com todos numeros:" + slist);
        List<Integer> pares = slist.stream()
                .map(s -> Integer.valueOf(s))
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Lista com apenas numeros pares: " + pares);
    }

    public void mostrarElemento(Aluno al) {
        for (int i = 0; i < listaAluno.size(); i++) {
            System.out.print(listaAluno.get(i) + " ");
        }
    }

    public void verificaQtdeElementos(Aluno al) {
        System.out.printf("\nTamanho atual do ArrayList: %s aluno%n", listaAluno.size());
    }

    public void verificaLista() {
        System.out.printf("A lista %sestá vazia%n", listaAluno.isEmpty() ? "" : "não ");
    }

    public void percorreLista(Aluno al) {
        Iterator<Aluno> itr = listaAluno.iterator();
        while (itr.hasNext()) {
            al = itr.next();
            System.out.println(al.getNome());
        }
    }
}
