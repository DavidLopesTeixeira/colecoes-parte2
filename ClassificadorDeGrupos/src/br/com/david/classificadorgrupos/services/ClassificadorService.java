package br.com.david.classificadorgrupos.services;

import br.com.david.classificadorgrupos.models.Pessoa;

import java.util.ArrayList;

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
        
    }
}
