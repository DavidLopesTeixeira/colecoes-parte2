
# Classificador de Grupos

Este projeto é um programa Java simples para coletar informações de pessoas (nome e sexo) e separá-las em grupos Masculino e Feminino. Além disso, o programa ordena cada grupo alfabeticamente e exibe os resultados.

## Estrutura do Projeto

A organização dos pacotes segue boas práticas, separando responsabilidades e facilitando a manutenção do código.

```
colecoes-parte2/
├── src/
│   ├── br/
│   │   └── com/
│   │       └── david/
│   │           ├── main/
│   │           │   └── App.java (Classe principal)
│   │           ├── models/
│   │           │   └── Pessoa.java
│   │           └── services/
│   │               └── ClassificadorService.java  
```

## Classes

### Pessoa.java
A classe `Pessoa` representa o objeto básico com `nome` e `sexo`, usados para classificação.

### ClassificadorService.java
A classe `ClassificadorService` é responsável por receber a lista de pessoas e separá-las em dois grupos (masculino e feminino), além de ordená-las por nome.

### App.java
A classe `App` cuida da interação com o usuário, coletando as informações e chamando o serviço de classificação.

## Como Usar

1. O usuário deve informar a quantidade de pessoas que deseja cadastrar.
2. O programa solicita que cada pessoa seja registrada no formato `Nome-Sexo`, por exemplo: `Daniela-F`.
3. Após o cadastro, o programa separa as pessoas em dois grupos:
   - Masculino
   - Feminino
4. As listas são ordenadas alfabeticamente e exibidas no console.

## Exemplo de Uso

```
Bem-vindo ao Classificador de Grupos!
Por favor, insira a quantidade de pessoas que deseja registrar:
5
Pessoa 1 (Nome-Sexo, ex: Daniela-F): João-M
Pessoa 2 (Nome-Sexo, ex: Daniela-F): Maria-F
Pessoa 3 (Nome-Sexo, ex: Daniela-F): Adriano-M
Pessoa 4 (Nome-Sexo, ex: Daniela-F): Bruno-M
Pessoa 2 (Nome-Sexo, ex: Daniela-F): Analia-F


Pessoas do sexo masculino em ordem alfabética:
Adriano (Masculino)
Bruno (Masculiono)
João (Masculino)

Pessoas do sexo feminino em ordem alfabética:
Analia (Feminino)
Maria (Feminino)

Obrigado por usar o Classificador de Grupos!
```

## Contribuição

Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias ou novas funcionalidades.

## Licença

Este projeto é de livre uso e modificação.
