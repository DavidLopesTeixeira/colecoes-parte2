package br.com.david.classificadorgrupos.main;

import br.com.david.classificadorgrupos.models.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        System.out.println("Bem-vindo ao Classificador de Grupos!");
        System.out.println("Por favor, insira a quantidade de pessoas que deseja registrar:");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < quantidade; i++){
            System.out.print("Pessoa " + (i + 1) + "(Nom-Sexo, Daniela-F): ");
            String entrada = scanner.nextLine();
            String[] dados = entrada.split("-");
        }
    }
}
