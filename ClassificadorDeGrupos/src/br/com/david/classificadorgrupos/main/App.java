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
            if(dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim().toUpperCase();
                if(sexo.equals("M") || sexo.equals("F")){
                    pessoas.add(new Pessoa(nome, sexo.equals("M") ? "Masculino" : "Feminino"));
                } else{
                    System.out.println("Sexo inválido. Use 'M' para Masculino ou 'F' para Feminino. Tente novamente.");
                    i--;
                }
            } else {
                System.out.println("Formato inválido. Use o formato (Nome-Sexo). Tente novamente.");
                i--;
            }
        }

        // Classificação e exibição das listas
    }
}
