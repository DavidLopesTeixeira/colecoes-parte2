package br.com.david.classificadorgrupos.services;

import br.com.david.classificadorgrupos.models.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ClassificadorService {
    // Todo classificar pessoas

    public void classificarPessoas(ArrayList<Pessoa> pessoas){
        ArrayList<Pessoa> masculinos = new ArrayList<>();
        ArrayList<Pessoa> femininos = new ArrayList<>();

        for(Pessoa pessoa : pessoas) {
            if(pessoa.getSexo().equalsIgnoreCase("Masculino")){
                masculinos.add(pessoa);
            } else if (pessoa.getSexo().equalsIgnoreCase("Feminino")) {
                femininos.add(pessoa);
            }
        }

        // Organizar a listas pelo nome
        Comparator<Pessoa> comparatorPorNome = Comparator.comparing(Pessoa::getNome);
        Collections.sort(masculinos, comparatorPorNome);
        Collections.sort(femininos, comparatorPorNome);

        // Exibir listas separadas e ordenadas
        System.out.println("\nPessoas do sexo masculino em ordem alfabética:");
        masculinos.forEach(System.out::println);

        System.out.println("\nPessoas do sexo feminino em ordem alfabética:");
        femininos.forEach(System.out::println);
    }
}
