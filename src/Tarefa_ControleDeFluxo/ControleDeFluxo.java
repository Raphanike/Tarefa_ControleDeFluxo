package Tarefa_ControleDeFluxo;

import java.util.Scanner;

/**
 * @author Raphael Cavalcante
 */

public class ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar as notas
        double[] notas = new double[4];

        // Recebe as notas do usuário
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota da matéria " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula a média
        double media = 0;
        for (int i = 0; i < 4; i++) {
            media += notas[i];
        }
        media /= 4;

        // Exibe a média
        System.out.println("\nMédia: " + media);

        // Verifica a situação do aluno
        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }

        scanner.close();
    }
}

