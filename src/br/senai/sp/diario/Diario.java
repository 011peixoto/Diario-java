package br.senai.sp.diario;

import java.util.Scanner;

public class Diario {
    public static void main(String[] args) {/** Declarar as variaveis */
        String professor;
        String disciplina;
        String nomeALuno;
        int frequncia;
        int nota1;
        int nota2;
        float media;

        /** instanciar teclado*/
        Scanner teclado = new Scanner(System.in);

        /**Coletar dados */
        System.out.println("-----Ola Prof seja bem vindo -------");
        System.out.println("------------------------------");
        System.out.println("Informe seu nome: ");
        professor = teclado.nextLine();
        System.out.println("QUal e a sua disciplina: ");
        disciplina = teclado.nextLine();
        System.out.println("Qual nome do Aluno: ");
        nomeALuno = teclado.nextLine();
        System.out.println("Informe qual e a Frequencia:");
        frequncia = teclado.nextInt();
        System.out.println("Informe a nota 1: ");
        nota1 = teclado.nextInt();
        System.out.println("Informe a nota 2: ");
        nota2 = teclado.nextInt();

        /** Calcula a Media do Aluno */

        media = (nota1 + nota2 / 2);

        /** Define condição do Aluno */
        if (media >= 7 && frequncia >= 75) {
            System.out.println("Aluno Aprovado !!");
        } else {
            System.out.println("Aluno Reprovado !!");

        }
        /** Calcula a media do Aluno */
        media = ((nota1 + nota2) / 2);

        boolean avaliaprof = professor.equals("vitor");

        /** define condição do Aluno */
        if (media >= 7 && frequncia >= 75 && !avaliaprof  || media >= 6 && frequncia >= 90 && !avaliaprof) {
            System.out.println("Aluno  Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }

            /** Printa as informações */
            System.out.println("-----------------------------");
            System.out.println("Relatorio");
            System.out.println("Ola prof Professor" + professor);
            System.out.println("Disciplina avaliada e : " + disciplina);
            System.out.println("O aluno avaliado e :  " + nomeALuno);
            System.out.println("A Frequencia: do aluno e " + media);
            System.out.println("A nota 1 e: " + nota1);
            System.out.println("a nota 2 e: " + nota2);
        }
    }
























